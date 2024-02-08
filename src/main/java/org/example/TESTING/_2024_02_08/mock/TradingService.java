package org.example.TESTING._2024_02_08.mock;

public interface TradingService {
	Long createTrade(Trade trade);
}

class SimpleTradingService implements TradingService {

	TradeRepository tradeRepository;
	AuditService auditService;

	public SimpleTradingService(TradeRepository tradeRepository, AuditService auditService) {
		this.tradeRepository = tradeRepository;
		this.auditService = auditService;
	}

	@Override
	public Long createTrade(Trade trade) throws CreateTradeException {
		Long id = tradeRepository.createTrade(trade);
		auditService.logNewTrade(trade);
		return id;
	}
}
package com.knightliao.canalx.core.plugin.processor;

import java.util.List;

import com.knightliao.canalx.core.plugin.processor.impl.EntryFilterChainImpl;

/**
 * @author knightliao
 * @date 2016/12/7 19:34
 */
public class EntryFilterChainFactory {

    public static IEntryFilterChain getEntryFilterChain(List<IEntryFilter> filters) {
        return new EntryFilterChainImpl(filters);
    }

}

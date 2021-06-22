package com.devonfw.module.httpclient.common.impl.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devonfw.module.service.common.api.client.sync.SyncServiceClientFactory;

/**
 * {@link Configuration} for REST (JAX-RS) clients using Apache CXF.
 *
 * @since 3.0.0
 */
@Configuration
public class HttpRestClientSyncAutoConfiguration {

  /**
   * @return an implementation of {@link SyncServiceClientFactory} based on CXF for REST (JAX-RS).
   */
  @Bean
  public SyncServiceClientFactory syncServiceClientFactoryHttpRest() {

    return new SyncServiceClientFactoryHttpRest();
  }

}

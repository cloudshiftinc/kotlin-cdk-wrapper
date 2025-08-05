@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Handler configuration construct for onPublish and onSubscribe.
 *
 * Example:
 *
 * ```
 * EventApi api;
 * AppSyncDynamoDbDataSource ddbDataSource;
 * AppSyncEventBridgeDataSource ebDataSource;
 * // DynamoDB data source for publish handler
 * api.addChannelNamespace("ddb-eb-ns", ChannelNamespaceOptions.builder()
 * .code(Code.fromInline("/ * event handler code here.*&#47;"))
 * .publishHandlerConfig(HandlerConfig.builder()
 * .dataSource(ddbDataSource)
 * .build())
 * .subscribeHandlerConfig(HandlerConfig.builder()
 * .dataSource(ebDataSource)
 * .build())
 * .build());
 * ```
 */
public interface HandlerConfig {
  /**
   * The Event Handler data source.
   *
   * Default: - no data source is used
   */
  public fun dataSource(): AppSyncBackedDataSource? =
      unwrap(this).getDataSource()?.let(AppSyncBackedDataSource::wrap)

  /**
   * If the Event Handler should invoke the data source directly.
   *
   * Default: - false
   */
  public fun direct(): Boolean? = unwrap(this).getDirect()

  /**
   * The Lambda invocation type for direct integrations.
   *
   * Default: - LambdaInvokeType.REQUEST_RESPONSE
   */
  public fun lambdaInvokeType(): LambdaInvokeType? =
      unwrap(this).getLambdaInvokeType()?.let(LambdaInvokeType::wrap)

  /**
   * A builder for [HandlerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataSource The Event Handler data source.
     */
    public fun dataSource(dataSource: AppSyncBackedDataSource)

    /**
     * @param direct If the Event Handler should invoke the data source directly.
     */
    public fun direct(direct: Boolean)

    /**
     * @param lambdaInvokeType The Lambda invocation type for direct integrations.
     */
    public fun lambdaInvokeType(lambdaInvokeType: LambdaInvokeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HandlerConfig.Builder =
        software.amazon.awscdk.services.appsync.HandlerConfig.builder()

    /**
     * @param dataSource The Event Handler data source.
     */
    override fun dataSource(dataSource: AppSyncBackedDataSource) {
      cdkBuilder.dataSource(dataSource.let(AppSyncBackedDataSource.Companion::unwrap))
    }

    /**
     * @param direct If the Event Handler should invoke the data source directly.
     */
    override fun direct(direct: Boolean) {
      cdkBuilder.direct(direct)
    }

    /**
     * @param lambdaInvokeType The Lambda invocation type for direct integrations.
     */
    override fun lambdaInvokeType(lambdaInvokeType: LambdaInvokeType) {
      cdkBuilder.lambdaInvokeType(lambdaInvokeType.let(LambdaInvokeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.HandlerConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.HandlerConfig,
  ) : CdkObject(cdkObject),
      HandlerConfig {
    /**
     * The Event Handler data source.
     *
     * Default: - no data source is used
     */
    override fun dataSource(): AppSyncBackedDataSource? =
        unwrap(this).getDataSource()?.let(AppSyncBackedDataSource::wrap)

    /**
     * If the Event Handler should invoke the data source directly.
     *
     * Default: - false
     */
    override fun direct(): Boolean? = unwrap(this).getDirect()

    /**
     * The Lambda invocation type for direct integrations.
     *
     * Default: - LambdaInvokeType.REQUEST_RESPONSE
     */
    override fun lambdaInvokeType(): LambdaInvokeType? =
        unwrap(this).getLambdaInvokeType()?.let(LambdaInvokeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HandlerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HandlerConfig):
        HandlerConfig = CdkObjectWrappers.wrap(cdkObject) as? HandlerConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HandlerConfig):
        software.amazon.awscdk.services.appsync.HandlerConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.HandlerConfig
  }
}

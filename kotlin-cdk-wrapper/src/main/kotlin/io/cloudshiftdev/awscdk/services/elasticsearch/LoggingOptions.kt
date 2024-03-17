@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Unit

/**
 * (deprecated) Configures log settings for the domain.
 *
 * Example:
 *
 * ```
 * Domain prodDomain = Domain.Builder.create(this, "Domain")
 * .version(ElasticsearchVersion.V7_1)
 * .capacity(CapacityConfig.builder()
 * .masterNodes(5)
 * .dataNodes(20)
 * .build())
 * .ebs(EbsOptions.builder()
 * .volumeSize(20)
 * .build())
 * .zoneAwareness(ZoneAwarenessConfig.builder()
 * .availabilityZoneCount(3)
 * .build())
 * .logging(LoggingOptions.builder()
 * .slowSearchLogEnabled(true)
 * .appLogEnabled(true)
 * .slowIndexLogEnabled(true)
 * .build())
 * .build();
 * ```
 *
 * @deprecated use opensearchservice module instead
 */
public interface LoggingOptions {
  /**
   * (deprecated) Specify if Elasticsearch application logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

  /**
   * (deprecated) Log Elasticsearch application logs to this log group.
   *
   * Default: - a new log group is created if app logging is enabled
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Specify if Elasticsearch audit logging should be set up.
   *
   * Requires Elasticsearch version 6.7 or later and fine grained access control to be enabled.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

  /**
   * (deprecated) Log Elasticsearch audit logs to this log group.
   *
   * Default: - a new log group is created if audit logging is enabled
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Specify if slow index logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

  /**
   * (deprecated) Log slow indices to this log group.
   *
   * Default: - a new log group is created if slow index logging is enabled
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Specify if slow search logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

  /**
   * (deprecated) Log slow searches to this log group.
   *
   * Default: - a new log group is created if slow search logging is enabled
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  /**
   * A builder for [LoggingOptions]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param appLogEnabled Specify if Elasticsearch application logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun appLogEnabled(appLogEnabled: Boolean)

    /**
     * @param appLogGroup Log Elasticsearch application logs to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun appLogGroup(appLogGroup: ILogGroup)

    /**
     * @param auditLogEnabled Specify if Elasticsearch audit logging should be set up.
     * Requires Elasticsearch version 6.7 or later and fine grained access control to be enabled.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun auditLogEnabled(auditLogEnabled: Boolean)

    /**
     * @param auditLogGroup Log Elasticsearch audit logs to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun auditLogGroup(auditLogGroup: ILogGroup)

    /**
     * @param slowIndexLogEnabled Specify if slow index logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean)

    /**
     * @param slowIndexLogGroup Log slow indices to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup)

    /**
     * @param slowSearchLogEnabled Specify if slow search logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean)

    /**
     * @param slowSearchLogGroup Log slow searches to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.LoggingOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.LoggingOptions.builder()

    /**
     * @param appLogEnabled Specify if Elasticsearch application logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun appLogEnabled(appLogEnabled: Boolean) {
      cdkBuilder.appLogEnabled(appLogEnabled)
    }

    /**
     * @param appLogGroup Log Elasticsearch application logs to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun appLogGroup(appLogGroup: ILogGroup) {
      cdkBuilder.appLogGroup(appLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param auditLogEnabled Specify if Elasticsearch audit logging should be set up.
     * Requires Elasticsearch version 6.7 or later and fine grained access control to be enabled.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun auditLogEnabled(auditLogEnabled: Boolean) {
      cdkBuilder.auditLogEnabled(auditLogEnabled)
    }

    /**
     * @param auditLogGroup Log Elasticsearch audit logs to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun auditLogGroup(auditLogGroup: ILogGroup) {
      cdkBuilder.auditLogGroup(auditLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param slowIndexLogEnabled Specify if slow index logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
      cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
    }

    /**
     * @param slowIndexLogGroup Log slow indices to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
      cdkBuilder.slowIndexLogGroup(slowIndexLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param slowSearchLogEnabled Specify if slow search logging should be set up.
     * Requires Elasticsearch version 5.1 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
      cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
    }

    /**
     * @param slowSearchLogGroup Log slow searches to this log group.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
      cdkBuilder.slowSearchLogGroup(slowSearchLogGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.LoggingOptions,
  ) : CdkObject(cdkObject), LoggingOptions {
    /**
     * (deprecated) Specify if Elasticsearch application logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

    /**
     * (deprecated) Log Elasticsearch application logs to this log group.
     *
     * Default: - a new log group is created if app logging is enabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

    /**
     * (deprecated) Specify if Elasticsearch audit logging should be set up.
     *
     * Requires Elasticsearch version 6.7 or later and fine grained access control to be enabled.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

    /**
     * (deprecated) Log Elasticsearch audit logs to this log group.
     *
     * Default: - a new log group is created if audit logging is enabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

    /**
     * (deprecated) Specify if slow index logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

    /**
     * (deprecated) Log slow indices to this log group.
     *
     * Default: - a new log group is created if slow index logging is enabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowIndexLogGroup(): ILogGroup? =
        unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

    /**
     * (deprecated) Specify if slow search logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

    /**
     * (deprecated) Log slow searches to this log group.
     *
     * Default: - a new log group is created if slow search logging is enabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun slowSearchLogGroup(): ILogGroup? =
        unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.LoggingOptions):
        LoggingOptions = CdkObjectWrappers.wrap(cdkObject) as? LoggingOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingOptions):
        software.amazon.awscdk.services.elasticsearch.LoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.LoggingOptions
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Unit

/**
 * Configures log settings for the domain.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .build())
 * .logging(LoggingOptions.builder()
 * .auditLogEnabled(true)
 * .slowSearchLogEnabled(true)
 * .appLogEnabled(true)
 * .slowIndexLogEnabled(true)
 * .build())
 * .build();
 * ```
 */
public interface LoggingOptions {
  /**
   * Specify if Amazon OpenSearch Service application logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   * An explicit `false` is required when disabling it from `true`.
   *
   * Default: - false
   */
  public fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

  /**
   * Log Amazon OpenSearch Service application logs to this log group.
   *
   * Default: - a new log group is created if app logging is enabled
   */
  public fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  /**
   * Specify if Amazon OpenSearch Service audit logging should be set up.
   *
   * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later and fine grained
   * access control to be enabled.
   *
   * Default: - false
   */
  public fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

  /**
   * Log Amazon OpenSearch Service audit logs to this log group.
   *
   * Default: - a new log group is created if audit logging is enabled
   */
  public fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  /**
   * Specify if slow index logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   * An explicit `false` is required when disabling it from `true`.
   *
   * Default: - false
   */
  public fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

  /**
   * Log slow indices to this log group.
   *
   * Default: - a new log group is created if slow index logging is enabled
   */
  public fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  /**
   * Specify if slow search logging should be set up.
   *
   * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
   * An explicit `false` is required when disabling it from `true`.
   *
   * Default: - false
   */
  public fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

  /**
   * Log slow searches to this log group.
   *
   * Default: - a new log group is created if slow search logging is enabled
   */
  public fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  /**
   * A builder for [LoggingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appLogEnabled Specify if Amazon OpenSearch Service application logging should be set
     * up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    public fun appLogEnabled(appLogEnabled: Boolean)

    /**
     * @param appLogGroup Log Amazon OpenSearch Service application logs to this log group.
     */
    public fun appLogGroup(appLogGroup: ILogGroup)

    /**
     * @param auditLogEnabled Specify if Amazon OpenSearch Service audit logging should be set up.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later and fine
     * grained access control to be enabled.
     */
    public fun auditLogEnabled(auditLogEnabled: Boolean)

    /**
     * @param auditLogGroup Log Amazon OpenSearch Service audit logs to this log group.
     */
    public fun auditLogGroup(auditLogGroup: ILogGroup)

    /**
     * @param slowIndexLogEnabled Specify if slow index logging should be set up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean)

    /**
     * @param slowIndexLogGroup Log slow indices to this log group.
     */
    public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup)

    /**
     * @param slowSearchLogEnabled Specify if slow search logging should be set up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean)

    /**
     * @param slowSearchLogGroup Log slow searches to this log group.
     */
    public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.LoggingOptions.Builder
        = software.amazon.awscdk.services.opensearchservice.LoggingOptions.builder()

    /**
     * @param appLogEnabled Specify if Amazon OpenSearch Service application logging should be set
     * up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    override fun appLogEnabled(appLogEnabled: Boolean) {
      cdkBuilder.appLogEnabled(appLogEnabled)
    }

    /**
     * @param appLogGroup Log Amazon OpenSearch Service application logs to this log group.
     */
    override fun appLogGroup(appLogGroup: ILogGroup) {
      cdkBuilder.appLogGroup(appLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param auditLogEnabled Specify if Amazon OpenSearch Service audit logging should be set up.
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later and fine
     * grained access control to be enabled.
     */
    override fun auditLogEnabled(auditLogEnabled: Boolean) {
      cdkBuilder.auditLogEnabled(auditLogEnabled)
    }

    /**
     * @param auditLogGroup Log Amazon OpenSearch Service audit logs to this log group.
     */
    override fun auditLogGroup(auditLogGroup: ILogGroup) {
      cdkBuilder.auditLogGroup(auditLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param slowIndexLogEnabled Specify if slow index logging should be set up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    override fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
      cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
    }

    /**
     * @param slowIndexLogGroup Log slow indices to this log group.
     */
    override fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
      cdkBuilder.slowIndexLogGroup(slowIndexLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param slowSearchLogEnabled Specify if slow search logging should be set up.
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     */
    override fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
      cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
    }

    /**
     * @param slowSearchLogGroup Log slow searches to this log group.
     */
    override fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
      cdkBuilder.slowSearchLogGroup(slowSearchLogGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.LoggingOptions,
  ) : CdkObject(cdkObject), LoggingOptions {
    /**
     * Specify if Amazon OpenSearch Service application logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     *
     * Default: - false
     */
    override fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

    /**
     * Log Amazon OpenSearch Service application logs to this log group.
     *
     * Default: - a new log group is created if app logging is enabled
     */
    override fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

    /**
     * Specify if Amazon OpenSearch Service audit logging should be set up.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later and fine
     * grained access control to be enabled.
     *
     * Default: - false
     */
    override fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

    /**
     * Log Amazon OpenSearch Service audit logs to this log group.
     *
     * Default: - a new log group is created if audit logging is enabled
     */
    override fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

    /**
     * Specify if slow index logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     *
     * Default: - false
     */
    override fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

    /**
     * Log slow indices to this log group.
     *
     * Default: - a new log group is created if slow index logging is enabled
     */
    override fun slowIndexLogGroup(): ILogGroup? =
        unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

    /**
     * Specify if slow search logging should be set up.
     *
     * Requires Elasticsearch version 5.1 or later or OpenSearch version 1.0 or later.
     * An explicit `false` is required when disabling it from `true`.
     *
     * Default: - false
     */
    override fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

    /**
     * Log slow searches to this log group.
     *
     * Default: - a new log group is created if slow search logging is enabled
     */
    override fun slowSearchLogGroup(): ILogGroup? =
        unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.LoggingOptions):
        LoggingOptions = CdkObjectWrappers.wrap(cdkObject) as? LoggingOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingOptions):
        software.amazon.awscdk.services.opensearchservice.LoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.LoggingOptions
  }
}

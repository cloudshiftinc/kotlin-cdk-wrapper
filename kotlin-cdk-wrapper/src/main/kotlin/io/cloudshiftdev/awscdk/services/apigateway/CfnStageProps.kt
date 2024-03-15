@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnStageProps {
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  public fun deploymentId(): String? = unwrap(this).getDeploymentId()

  public fun description(): String? = unwrap(this).getDescription()

  public fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

  public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  public fun restApiId(): String

  public fun stageName(): String? = unwrap(this).getStageName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  public fun variables(): Any? = unwrap(this).getVariables()

  @CdkDslMarker
  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable)

    public fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0398b89c2b07d4fc6b40a840e89306ef6a3c4dd065f736178b207e44b48d8f5")
    public
        fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty.Builder.() -> Unit)

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    public fun cacheClusterSize(cacheClusterSize: String)

    public fun canarySetting(canarySetting: IResolvable)

    public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e44ed68f587e9bf1e6cdee1aa0acd04eccf03f11f778231b4767638f817ddae2")
    public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty.Builder.() -> Unit)

    public fun clientCertificateId(clientCertificateId: String)

    public fun deploymentId(deploymentId: String)

    public fun description(description: String)

    public fun documentationVersion(documentationVersion: String)

    public fun methodSettings(methodSettings: IResolvable)

    public fun methodSettings(methodSettings: List<Any>)

    public fun methodSettings(vararg methodSettings: Any)

    public fun restApiId(restApiId: String)

    public fun stageName(stageName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tracingEnabled(tracingEnabled: Boolean)

    public fun tracingEnabled(tracingEnabled: IResolvable)

    public fun variables(variables: IResolvable)

    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnStageProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnStageProps.builder()

    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    override fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnStage.AccessLogSettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0398b89c2b07d4fc6b40a840e89306ef6a3c4dd065f736178b207e44b48d8f5")
    override
        fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnStage.AccessLogSettingProperty(accessLogSetting))

    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable::unwrap))
    }

    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable::unwrap))
    }

    override fun canarySetting(canarySetting: CfnStage.CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CfnStage.CanarySettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e44ed68f587e9bf1e6cdee1aa0acd04eccf03f11f778231b4767638f817ddae2")
    override fun canarySetting(canarySetting: CfnStage.CanarySettingProperty.Builder.() -> Unit):
        Unit = canarySetting(CfnStage.CanarySettingProperty(canarySetting))

    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
    }

    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings)
    }

    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable::unwrap))
    }

    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnStageProps,
  ) : CdkObject(cdkObject), CfnStageProps {
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    override fun deploymentId(): String? = unwrap(this).getDeploymentId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun stageName(): String? = unwrap(this).getStageName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStageProps):
        CfnStageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStageProps):
        software.amazon.awscdk.services.apigateway.CfnStageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnStageProps
  }
}

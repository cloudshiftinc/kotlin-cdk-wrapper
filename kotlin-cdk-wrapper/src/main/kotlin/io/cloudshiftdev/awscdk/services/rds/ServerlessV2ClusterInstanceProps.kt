@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServerlessV2ClusterInstanceProps : ClusterInstanceOptions {
  public fun scaleWithWriter(): Boolean? = unwrap(this).getScaleWithWriter()

  @CdkDslMarker
  public interface Builder {
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun caCertificate(caCertificate: CaCertificate)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun instanceIdentifier(instanceIdentifier: String)

    public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun parameters(parameters: Map<String, String>)

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun scaleWithWriter(scaleWithWriter: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps.Builder =
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps.builder()

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun caCertificate(caCertificate: CaCertificate) {
      cdkBuilder.caCertificate(caCertificate.let(CaCertificate::unwrap))
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    override fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean) {
      cdkBuilder.isFromLegacyInstanceProps(isFromLegacyInstanceProps)
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun scaleWithWriter(scaleWithWriter: Boolean) {
      cdkBuilder.scaleWithWriter(scaleWithWriter)
    }

    public fun build(): software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps,
  ) : CdkObject(cdkObject), ServerlessV2ClusterInstanceProps {
    override fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    override fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

    override fun isFromLegacyInstanceProps(): Boolean? = unwrap(this).getIsFromLegacyInstanceProps()

    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

    override fun scaleWithWriter(): Boolean? = unwrap(this).getScaleWithWriter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessV2ClusterInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps):
        ServerlessV2ClusterInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessV2ClusterInstanceProps):
        software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ServerlessV2ClusterInstanceProps
  }
}

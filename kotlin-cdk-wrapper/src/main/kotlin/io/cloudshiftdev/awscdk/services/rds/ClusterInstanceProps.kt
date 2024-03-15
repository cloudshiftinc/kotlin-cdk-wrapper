@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ClusterInstanceProps : ClusterInstanceOptions {
  public fun instanceType(): ClusterInstanceType

  public fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  @CdkDslMarker
  public interface Builder {
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun caCertificate(caCertificate: CaCertificate)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun instanceIdentifier(instanceIdentifier: String)

    public fun instanceType(instanceType: ClusterInstanceType)

    public fun isFromLegacyInstanceProps(isFromLegacyInstanceProps: Boolean)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun parameters(parameters: Map<String, String>)

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention)

    public fun promotionTier(promotionTier: Number)

    public fun publiclyAccessible(publiclyAccessible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterInstanceProps.Builder =
        software.amazon.awscdk.services.rds.ClusterInstanceProps.builder()

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

    override fun instanceType(instanceType: ClusterInstanceType) {
      cdkBuilder.instanceType(instanceType.let(ClusterInstanceType::unwrap))
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

    override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceProps,
  ) : CdkObject(cdkObject), ClusterInstanceProps {
    override fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun caCertificate(): CaCertificate? =
        unwrap(this).getCaCertificate()?.let(CaCertificate::wrap)

    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    override fun instanceIdentifier(): String? = unwrap(this).getInstanceIdentifier()

    override fun instanceType(): ClusterInstanceType =
        unwrap(this).getInstanceType().let(ClusterInstanceType::wrap)

    override fun isFromLegacyInstanceProps(): Boolean? = unwrap(this).getIsFromLegacyInstanceProps()

    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    override fun promotionTier(): Number? = unwrap(this).getPromotionTier()

    override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterInstanceProps):
        ClusterInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterInstanceProps):
        software.amazon.awscdk.services.rds.ClusterInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.ClusterInstanceProps
  }
}

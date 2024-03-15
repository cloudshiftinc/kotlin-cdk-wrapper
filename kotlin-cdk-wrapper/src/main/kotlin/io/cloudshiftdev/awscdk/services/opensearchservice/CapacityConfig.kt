@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CapacityConfig {
  public fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

  public fun dataNodes(): Number? = unwrap(this).getDataNodes()

  public fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

  public fun masterNodes(): Number? = unwrap(this).getMasterNodes()

  public fun multiAzWithStandbyEnabled(): Boolean? = unwrap(this).getMultiAzWithStandbyEnabled()

  public fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

  public fun warmNodes(): Number? = unwrap(this).getWarmNodes()

  @CdkDslMarker
  public interface Builder {
    public fun dataNodeInstanceType(dataNodeInstanceType: String)

    public fun dataNodes(dataNodes: Number)

    public fun masterNodeInstanceType(masterNodeInstanceType: String)

    public fun masterNodes(masterNodes: Number)

    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean)

    public fun warmInstanceType(warmInstanceType: String)

    public fun warmNodes(warmNodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CapacityConfig.Builder
        = software.amazon.awscdk.services.opensearchservice.CapacityConfig.builder()

    override fun dataNodeInstanceType(dataNodeInstanceType: String) {
      cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    override fun dataNodes(dataNodes: Number) {
      cdkBuilder.dataNodes(dataNodes)
    }

    override fun masterNodeInstanceType(masterNodeInstanceType: String) {
      cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    override fun masterNodes(masterNodes: Number) {
      cdkBuilder.masterNodes(masterNodes)
    }

    override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
      cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    override fun warmInstanceType(warmInstanceType: String) {
      cdkBuilder.warmInstanceType(warmInstanceType)
    }

    override fun warmNodes(warmNodes: Number) {
      cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CapacityConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig,
  ) : CdkObject(cdkObject), CapacityConfig {
    override fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

    override fun dataNodes(): Number? = unwrap(this).getDataNodes()

    override fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

    override fun masterNodes(): Number? = unwrap(this).getMasterNodes()

    override fun multiAzWithStandbyEnabled(): Boolean? = unwrap(this).getMultiAzWithStandbyEnabled()

    override fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

    override fun warmNodes(): Number? = unwrap(this).getWarmNodes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig):
        CapacityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.opensearchservice.CapacityConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CapacityConfig
  }
}

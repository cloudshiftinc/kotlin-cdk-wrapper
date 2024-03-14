package io.cloudshiftdev.awscdk.services.opensearchservice

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

  public interface Builder {
    public fun dataNodeInstanceType(dataNodeInstanceType: String) {
    }

    public fun dataNodes(dataNodes: Number) {
    }

    public fun masterNodeInstanceType(masterNodeInstanceType: String) {
    }

    public fun masterNodes(masterNodes: Number) {
    }

    public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
    }

    public fun warmInstanceType(warmInstanceType: String) {
    }

    public fun warmNodes(warmNodes: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CapacityConfig.Builder
        = software.amazon.awscdk.services.opensearchservice.CapacityConfig.builder()

    public override fun dataNodeInstanceType(dataNodeInstanceType: String) {
      cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    public override fun dataNodes(dataNodes: Number) {
      cdkBuilder.dataNodes(dataNodes)
    }

    public override fun masterNodeInstanceType(masterNodeInstanceType: String) {
      cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    public override fun masterNodes(masterNodes: Number) {
      cdkBuilder.masterNodes(masterNodes)
    }

    public override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
      cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
    }

    public override fun warmInstanceType(warmInstanceType: String) {
      cdkBuilder.warmInstanceType(warmInstanceType)
    }

    public override fun warmNodes(warmNodes: Number) {
      cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CapacityConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig,
  ) : CapacityConfig {
    public override fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

    public override fun dataNodes(): Number? = unwrap(this).getDataNodes()

    public override fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

    public override fun masterNodes(): Number? = unwrap(this).getMasterNodes()

    public override fun multiAzWithStandbyEnabled(): Boolean? =
        unwrap(this).getMultiAzWithStandbyEnabled()

    public override fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

    public override fun warmNodes(): Number? = unwrap(this).getWarmNodes()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CapacityConfig):
        CapacityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.opensearchservice.CapacityConfig = (wrapped as
        Wrapper).cdkObject
  }
}

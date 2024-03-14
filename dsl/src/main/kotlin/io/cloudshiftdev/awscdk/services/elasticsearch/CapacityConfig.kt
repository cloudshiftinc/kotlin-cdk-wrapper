package io.cloudshiftdev.awscdk.services.elasticsearch

import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CapacityConfig {
  @Deprecated(message = "deprecated in CDK")
  public fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

  @Deprecated(message = "deprecated in CDK")
  public fun dataNodes(): Number? = unwrap(this).getDataNodes()

  @Deprecated(message = "deprecated in CDK")
  public fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

  @Deprecated(message = "deprecated in CDK")
  public fun masterNodes(): Number? = unwrap(this).getMasterNodes()

  @Deprecated(message = "deprecated in CDK")
  public fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

  @Deprecated(message = "deprecated in CDK")
  public fun warmNodes(): Number? = unwrap(this).getWarmNodes()

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun dataNodeInstanceType(dataNodeInstanceType: String)

    @Deprecated(message = "deprecated in CDK")
    public fun dataNodes(dataNodes: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun masterNodeInstanceType(masterNodeInstanceType: String)

    @Deprecated(message = "deprecated in CDK")
    public fun masterNodes(masterNodes: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun warmInstanceType(warmInstanceType: String)

    @Deprecated(message = "deprecated in CDK")
    public fun warmNodes(warmNodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CapacityConfig.Builder =
        software.amazon.awscdk.services.elasticsearch.CapacityConfig.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun dataNodeInstanceType(dataNodeInstanceType: String) {
      cdkBuilder.dataNodeInstanceType(dataNodeInstanceType)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun dataNodes(dataNodes: Number) {
      cdkBuilder.dataNodes(dataNodes)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun masterNodeInstanceType(masterNodeInstanceType: String) {
      cdkBuilder.masterNodeInstanceType(masterNodeInstanceType)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun masterNodes(masterNodes: Number) {
      cdkBuilder.masterNodes(masterNodes)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun warmInstanceType(warmInstanceType: String) {
      cdkBuilder.warmInstanceType(warmInstanceType)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun warmNodes(warmNodes: Number) {
      cdkBuilder.warmNodes(warmNodes)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CapacityConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig,
  ) : CapacityConfig {
    @Deprecated(message = "deprecated in CDK")
    override fun dataNodeInstanceType(): String? = unwrap(this).getDataNodeInstanceType()

    @Deprecated(message = "deprecated in CDK")
    override fun dataNodes(): Number? = unwrap(this).getDataNodes()

    @Deprecated(message = "deprecated in CDK")
    override fun masterNodeInstanceType(): String? = unwrap(this).getMasterNodeInstanceType()

    @Deprecated(message = "deprecated in CDK")
    override fun masterNodes(): Number? = unwrap(this).getMasterNodes()

    @Deprecated(message = "deprecated in CDK")
    override fun warmInstanceType(): String? = unwrap(this).getWarmInstanceType()

    @Deprecated(message = "deprecated in CDK")
    override fun warmNodes(): Number? = unwrap(this).getWarmNodes()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CapacityConfig):
        CapacityConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityConfig):
        software.amazon.awscdk.services.elasticsearch.CapacityConfig = (wrapped as
        Wrapper).cdkObject
  }
}

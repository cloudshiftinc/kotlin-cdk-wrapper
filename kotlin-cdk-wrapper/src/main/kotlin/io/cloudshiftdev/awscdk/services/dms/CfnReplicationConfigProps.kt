@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnReplicationConfigProps {
  public fun computeConfig(): Any? = unwrap(this).getComputeConfig()

  public fun replicationConfigIdentifier(): String? = unwrap(this).getReplicationConfigIdentifier()

  public fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

  public fun replicationType(): String? = unwrap(this).getReplicationType()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

  public fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

  public fun tableMappings(): Any? = unwrap(this).getTableMappings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()

  @CdkDslMarker
  public interface Builder {
    public fun computeConfig(computeConfig: IResolvable)

    public fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48f0a1ddb325030aa58029aeabf6302e1a395a57e340bb964b54170359f95fe0")
    public
        fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty.Builder.() -> Unit)

    public fun replicationConfigIdentifier(replicationConfigIdentifier: String)

    public fun replicationSettings(replicationSettings: Any)

    public fun replicationType(replicationType: String)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun sourceEndpointArn(sourceEndpointArn: String)

    public fun supplementalSettings(supplementalSettings: Any)

    public fun tableMappings(tableMappings: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetEndpointArn(targetEndpointArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationConfigProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationConfigProps.builder()

    override fun computeConfig(computeConfig: IResolvable) {
      cdkBuilder.computeConfig(computeConfig.let(IResolvable::unwrap))
    }

    override fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty) {
      cdkBuilder.computeConfig(computeConfig.let(CfnReplicationConfig.ComputeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48f0a1ddb325030aa58029aeabf6302e1a395a57e340bb964b54170359f95fe0")
    override
        fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty.Builder.() -> Unit):
        Unit = computeConfig(CfnReplicationConfig.ComputeConfigProperty(computeConfig))

    override fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
      cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    override fun replicationSettings(replicationSettings: Any) {
      cdkBuilder.replicationSettings(replicationSettings)
    }

    override fun replicationType(replicationType: String) {
      cdkBuilder.replicationType(replicationType)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    override fun supplementalSettings(supplementalSettings: Any) {
      cdkBuilder.supplementalSettings(supplementalSettings)
    }

    override fun tableMappings(tableMappings: Any) {
      cdkBuilder.tableMappings(tableMappings)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfigProps,
  ) : CdkObject(cdkObject), CfnReplicationConfigProps {
    override fun computeConfig(): Any? = unwrap(this).getComputeConfig()

    override fun replicationConfigIdentifier(): String? =
        unwrap(this).getReplicationConfigIdentifier()

    override fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

    override fun replicationType(): String? = unwrap(this).getReplicationType()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

    override fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

    override fun tableMappings(): Any? = unwrap(this).getTableMappings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfigProps):
        CfnReplicationConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfigProps):
        software.amazon.awscdk.services.dms.CfnReplicationConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationConfigProps
  }
}

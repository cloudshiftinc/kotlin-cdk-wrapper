@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun clusterEndpointEncryptionType(): String? =
      unwrap(this).getClusterEndpointEncryptionType()

  public fun clusterName(): String? = unwrap(this).getClusterName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun iamRoleArn(): String

  public fun nodeType(): String

  public fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun replicationFactor(): Number

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String)

    public fun clusterName(clusterName: String)

    public fun description(description: String)

    public fun iamRoleArn(iamRoleArn: String)

    public fun nodeType(nodeType: String)

    public fun notificationTopicArn(notificationTopicArn: String)

    public fun parameterGroupName(parameterGroupName: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun replicationFactor(replicationFactor: Number)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6eb4a9e524c66505b81269be33d5b60faec9517e7032686c4daf1623a2f2da1")
    public
        fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty.Builder.() -> Unit)

    public fun subnetGroupName(subnetGroupName: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnClusterProps.Builder =
        software.amazon.awscdk.services.dax.CfnClusterProps.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String) {
      cdkBuilder.clusterEndpointEncryptionType(clusterEndpointEncryptionType)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnCluster.SSESpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6eb4a9e524c66505b81269be33d5b60faec9517e7032686c4daf1623a2f2da1")
    override
        fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnCluster.SSESpecificationProperty(sseSpecification))

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun clusterEndpointEncryptionType(): String? =
        unwrap(this).getClusterEndpointEncryptionType()

    override fun clusterName(): String? = unwrap(this).getClusterName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    override fun nodeType(): String = unwrap(this).getNodeType()

    override fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun replicationFactor(): Number = unwrap(this).getReplicationFactor()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.dax.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dax.CfnClusterProps
  }
}

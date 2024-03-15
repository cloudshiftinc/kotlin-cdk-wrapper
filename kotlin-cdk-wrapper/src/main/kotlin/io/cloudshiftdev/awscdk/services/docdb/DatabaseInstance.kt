@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstance,
) : Resource(cdkObject), IDatabaseInstance {
  public open fun cluster(): IDatabaseCluster =
      unwrap(this).getCluster().let(IDatabaseCluster::wrap)

  public override fun dbInstanceEndpointAddress(): String =
      unwrap(this).getDbInstanceEndpointAddress()

  public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

  public override fun instanceArn(): String = unwrap(this).getInstanceArn()

  public override fun instanceEndpoint(): Endpoint =
      unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

  public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

  @CdkDslMarker
  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun cluster(cluster: IDatabaseCluster)

    public fun dbInstanceName(dbInstanceName: String)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun instanceType(instanceType: InstanceType)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstance.Builder =
        software.amazon.awscdk.services.docdb.DatabaseInstance.Builder.create(scope, id)

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun cluster(cluster: IDatabaseCluster) {
      cdkBuilder.cluster(cluster.let(IDatabaseCluster::unwrap))
    }

    override fun dbInstanceName(dbInstanceName: String) {
      cdkBuilder.dbInstanceName(dbInstanceName)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstance = cdkBuilder.build()
  }

  public companion object {
    public fun fromDatabaseInstanceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseInstanceAttributes,
    ): IDatabaseInstance =
        software.amazon.awscdk.services.docdb.DatabaseInstance.fromDatabaseInstanceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DatabaseInstanceAttributes::unwrap)).let(IDatabaseInstance::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff4a584981905c20a48b9c9367a21a00691a564de963b093a11b8692116afdde")
    public fun fromDatabaseInstanceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DatabaseInstanceAttributes.Builder.() -> Unit,
    ): IDatabaseInstance = fromDatabaseInstanceAttributes(scope, id,
        DatabaseInstanceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstance):
        DatabaseInstance = DatabaseInstance(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstance):
        software.amazon.awscdk.services.docdb.DatabaseInstance = wrapped.cdkObject
  }
}

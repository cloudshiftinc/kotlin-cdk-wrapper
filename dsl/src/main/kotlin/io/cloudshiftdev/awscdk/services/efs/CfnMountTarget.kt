package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMountTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrIpAddress(): String = unwrap(this).getAttrIpAddress()

  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddress(): String? = unwrap(this).getIpAddress()

  public open fun ipAddress(`value`: String) {
    unwrap(this).setIpAddress(`value`)
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public interface Builder {
    public fun fileSystemId(fileSystemId: String) {
    }

    public fun ipAddress(ipAddress: String) {
    }

    public fun securityGroups(securityGroups: List<String>) {
    }

    public fun subnetId(subnetId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTarget.Builder =
        software.amazon.awscdk.services.efs.CfnMountTarget.Builder.create(scope, id)

    public override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    public override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    public override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    public override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTarget = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMountTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMountTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTarget): CfnMountTarget
        = CfnMountTarget(cdkObject)

    internal fun unwrap(wrapped: CfnMountTarget): software.amazon.awscdk.services.efs.CfnMountTarget
        = wrapped.cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.neptune.CfnDBInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  public open fun allowMajorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`)
  }

  public open fun allowMajorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPort(): String = unwrap(this).getAttrPort()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  public open fun dbInstanceClass(): String = unwrap(this).getDbInstanceClass()

  public open fun dbInstanceClass(`value`: String) {
    unwrap(this).setDbInstanceClass(`value`)
  }

  public open fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  public open fun dbInstanceIdentifier(`value`: String) {
    unwrap(this).setDbInstanceIdentifier(`value`)
  }

  public open fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  public open fun dbParameterGroupName(`value`: String) {
    unwrap(this).setDbParameterGroupName(`value`)
  }

  public open fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  public open fun dbSnapshotIdentifier(`value`: String) {
    unwrap(this).setDbSnapshotIdentifier(`value`)
  }

  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbInstanceClass(dbInstanceClass: String)

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    public fun dbParameterGroupName(dbParameterGroupName: String)

    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBInstance.Builder =
        software.amazon.awscdk.services.neptune.CfnDBInstance.Builder.create(scope, id)

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    override fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
      cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBInstance):
        CfnDBInstance = CfnDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstance):
        software.amazon.awscdk.services.neptune.CfnDBInstance = wrapped.cdkObject
  }
}

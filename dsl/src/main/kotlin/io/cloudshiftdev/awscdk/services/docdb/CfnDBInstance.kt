package io.cloudshiftdev.awscdk.services.docdb

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
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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

  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
  }

  public open fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  public open fun certificateRotationRestart(`value`: Boolean) {
    unwrap(this).setCertificateRotationRestart(`value`)
  }

  public open fun certificateRotationRestart(`value`: IResolvable) {
    unwrap(this).setCertificateRotationRestart(`value`.let(IResolvable::unwrap))
  }

  public open fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

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

  public open fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  public open fun enablePerformanceInsights(`value`: Boolean) {
    unwrap(this).setEnablePerformanceInsights(`value`)
  }

  public open fun enablePerformanceInsights(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceInsights(`value`.let(IResolvable::unwrap))
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbInstanceClass(dbInstanceClass: String)

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBInstance.Builder =
        software.amazon.awscdk.services.docdb.CfnDBInstance.Builder.create(scope, id)

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
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

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBInstance = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstance): CfnDBInstance
        = CfnDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstance): software.amazon.awscdk.services.docdb.CfnDBInstance
        = wrapped.cdkObject
  }
}

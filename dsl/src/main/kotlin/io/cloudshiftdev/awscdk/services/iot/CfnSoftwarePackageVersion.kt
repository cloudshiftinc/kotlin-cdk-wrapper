package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSoftwarePackageVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrErrorReason(): String = unwrap(this).getAttrErrorReason()

  public open fun attrPackageVersionArn(): String = unwrap(this).getAttrPackageVersionArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun packageName(): String = unwrap(this).getPackageName()

  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun versionName(): String? = unwrap(this).getVersionName()

  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  public interface Builder {
    public fun attributes(attributes: IResolvable) {
    }

    public fun attributes(attributes: Map<String, String>) {
    }

    public fun description(description: String) {
    }

    public fun packageName(packageName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun versionName(versionName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder.create(scope, id)

    public override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    public override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSoftwarePackageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSoftwarePackageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion):
        CfnSoftwarePackageVersion = CfnSoftwarePackageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersion):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion = wrapped.cdkObject
  }
}

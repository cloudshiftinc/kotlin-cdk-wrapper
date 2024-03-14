package io.cloudshiftdev.awscdk.services.iotfleethub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  public open fun attrApplicationCreationDate(): Number =
      unwrap(this).getAttrApplicationCreationDate()

  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  public open fun attrApplicationLastUpdateDate(): Number =
      unwrap(this).getAttrApplicationLastUpdateDate()

  public open fun attrApplicationState(): String = unwrap(this).getAttrApplicationState()

  public open fun attrApplicationUrl(): String = unwrap(this).getAttrApplicationUrl()

  public open fun attrErrorMessage(): String = unwrap(this).getAttrErrorMessage()

  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun applicationDescription(applicationDescription: String)

    public fun applicationName(applicationName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder =
        software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder.create(scope, id)

    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotfleethub.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.iotfleethub.CfnApplication = wrapped.cdkObject
  }
}

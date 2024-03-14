package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnLogGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  public open fun dataProtectionPolicy(`value`: Any) {
    unwrap(this).setDataProtectionPolicy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

  public open fun logGroupClass(`value`: String) {
    unwrap(this).setLogGroupClass(`value`)
  }

  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  public open fun retentionInDays(`value`: Number) {
    unwrap(this).setRetentionInDays(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logGroupClass(logGroupClass: String)

    public fun logGroupName(logGroupName: String)

    public fun retentionInDays(retentionInDays: Number)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogGroup.Builder =
        software.amazon.awscdk.services.logs.CfnLogGroup.Builder.create(scope, id)

    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logGroupClass(logGroupClass: String) {
      cdkBuilder.logGroupClass(logGroupClass)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnLogGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogGroup): CfnLogGroup =
        CfnLogGroup(cdkObject)

    internal fun unwrap(wrapped: CfnLogGroup): software.amazon.awscdk.services.logs.CfnLogGroup =
        wrapped.cdkObject
  }
}

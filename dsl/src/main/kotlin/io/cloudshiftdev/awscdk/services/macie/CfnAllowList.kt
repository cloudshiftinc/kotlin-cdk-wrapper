package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAllowList internal constructor(
  private val cdkObject: software.amazon.awscdk.services.macie.CfnAllowList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun criteria(): Any = unwrap(this).getCriteria()

  public open fun criteria(`value`: IResolvable) {
    unwrap(this).setCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun criteria(`value`: CriteriaProperty) {
    unwrap(this).setCriteria(`value`.let(CriteriaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d65c91cff84a7f121af7c0244807d8544f4186dabe5a9623fd417d5eab2b2c22")
  public open fun criteria(`value`: CriteriaProperty.Builder.() -> Unit): Unit =
      criteria(CriteriaProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun criteria(criteria: IResolvable)

    public fun criteria(criteria: CriteriaProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81a1354b1254e1098cedc1a694d217bd9777405cc6505b1e846e87c2ce43e950")
    public fun criteria(criteria: CriteriaProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnAllowList.Builder =
        software.amazon.awscdk.services.macie.CfnAllowList.Builder.create(scope, id)

    override fun criteria(criteria: IResolvable) {
      cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
    }

    override fun criteria(criteria: CriteriaProperty) {
      cdkBuilder.criteria(criteria.let(CriteriaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81a1354b1254e1098cedc1a694d217bd9777405cc6505b1e846e87c2ce43e950")
    override fun criteria(criteria: CriteriaProperty.Builder.() -> Unit): Unit =
        criteria(CriteriaProperty(criteria))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnAllowList = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAllowList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAllowList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnAllowList): CfnAllowList =
        CfnAllowList(cdkObject)

    internal fun unwrap(wrapped: CfnAllowList): software.amazon.awscdk.services.macie.CfnAllowList =
        wrapped.cdkObject
  }

  public interface S3WordsListProperty {
    public fun bucketName(): String

    public fun objectKey(): String

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun objectKey(objectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty.Builder =
          software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
      }

      public fun build(): software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty,
    ) : S3WordsListProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun objectKey(): String = unwrap(this).getObjectKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3WordsListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty):
          S3WordsListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3WordsListProperty):
          software.amazon.awscdk.services.macie.CfnAllowList.S3WordsListProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CriteriaProperty {
    public fun regex(): String? = unwrap(this).getRegex()

    public fun s3WordsList(): Any? = unwrap(this).getS3WordsList()

    public interface Builder {
      public fun regex(regex: String)

      public fun s3WordsList(s3WordsList: IResolvable)

      public fun s3WordsList(s3WordsList: S3WordsListProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("827e7817016e7a855e7b5ac67984754f084dd8d4ef5e93d841164f34cbfe219a")
      public fun s3WordsList(s3WordsList: S3WordsListProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty.Builder =
          software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty.builder()

      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      override fun s3WordsList(s3WordsList: IResolvable) {
        cdkBuilder.s3WordsList(s3WordsList.let(IResolvable::unwrap))
      }

      override fun s3WordsList(s3WordsList: S3WordsListProperty) {
        cdkBuilder.s3WordsList(s3WordsList.let(S3WordsListProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("827e7817016e7a855e7b5ac67984754f084dd8d4ef5e93d841164f34cbfe219a")
      override fun s3WordsList(s3WordsList: S3WordsListProperty.Builder.() -> Unit): Unit =
          s3WordsList(S3WordsListProperty(s3WordsList))

      public fun build(): software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty,
    ) : CriteriaProperty {
      override fun regex(): String? = unwrap(this).getRegex()

      override fun s3WordsList(): Any? = unwrap(this).getS3WordsList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty):
          CriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CriteriaProperty):
          software.amazon.awscdk.services.macie.CfnAllowList.CriteriaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

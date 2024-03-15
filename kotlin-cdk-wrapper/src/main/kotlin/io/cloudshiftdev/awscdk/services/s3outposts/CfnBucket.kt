@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun bucketName(): String = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b114a8fa3d88477c0ae14e9bbd2bf4b0be10bd048f7790ad84f282857bab5ecd")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  public open fun outpostId(): String = unwrap(this).getOutpostId()

  public open fun outpostId(`value`: String) {
    unwrap(this).setOutpostId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    public fun outpostId(outpostId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucket.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucket.Builder.create(scope, id)

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket): CfnBucket =
        CfnBucket(cdkObject)

    internal fun unwrap(wrapped: CfnBucket): software.amazon.awscdk.services.s3outposts.CfnBucket =
        wrapped.cdkObject
  }

  public interface LifecycleConfigurationProperty {
    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.builder()

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleConfigurationProperty {
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty
    }
  }

  public interface FilterTagProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty,
    ) : CdkObject(cdkObject), FilterTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty):
          FilterTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterTagProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty
    }
  }

  public interface RuleProperty {
    public fun abortIncompleteMultipartUpload(): Any? =
        unwrap(this).getAbortIncompleteMultipartUpload()

    public fun expirationDate(): String? = unwrap(this).getExpirationDate()

    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun id(): String? = unwrap(this).getId()

    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable)

      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit)

      public fun expirationDate(expirationDate: String)

      public fun expirationInDays(expirationInDays: Number)

      public fun filter(filter: Any)

      public fun id(id: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.builder()

      override fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable::unwrap))
      }

      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      override fun expirationDate(expirationDate: String) {
        cdkBuilder.expirationDate(expirationDate)
      }

      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      override fun filter(filter: Any) {
        cdkBuilder.filter(filter)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      override fun expirationDate(): String? = unwrap(this).getExpirationDate()

      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      override fun filter(): Any? = unwrap(this).getFilter()

      override fun id(): String? = unwrap(this).getId()

      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty
    }
  }

  public interface AbortIncompleteMultipartUploadProperty {
    public fun daysAfterInitiation(): Number

    @CdkDslMarker
    public interface Builder {
      public fun daysAfterInitiation(daysAfterInitiation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

      override fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty,
    ) : CdkObject(cdkObject), AbortIncompleteMultipartUploadProperty {
      override fun daysAfterInitiation(): Number = unwrap(this).getDaysAfterInitiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AbortIncompleteMultipartUploadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty):
          AbortIncompleteMultipartUploadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortIncompleteMultipartUploadProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
    }
  }

  public interface FilterProperty {
    public fun andOperator(): Any? = unwrap(this).getAndOperator()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tag(): Any? = unwrap(this).getTag()

    @CdkDslMarker
    public interface Builder {
      public fun andOperator(andOperator: IResolvable)

      public fun andOperator(andOperator: FilterAndOperatorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      public fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit)

      public fun prefix(prefix: String)

      public fun tag(tag: IResolvable)

      public fun tag(tag: FilterTagProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      public fun tag(tag: FilterTagProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.builder()

      override fun andOperator(andOperator: IResolvable) {
        cdkBuilder.andOperator(andOperator.let(IResolvable::unwrap))
      }

      override fun andOperator(andOperator: FilterAndOperatorProperty) {
        cdkBuilder.andOperator(andOperator.let(FilterAndOperatorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      override fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit): Unit =
          andOperator(FilterAndOperatorProperty(andOperator))

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun tag(tag: IResolvable) {
        cdkBuilder.tag(tag.let(IResolvable::unwrap))
      }

      override fun tag(tag: FilterTagProperty) {
        cdkBuilder.tag(tag.let(FilterTagProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      override fun tag(tag: FilterTagProperty.Builder.() -> Unit): Unit =
          tag(FilterTagProperty(tag))

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      override fun andOperator(): Any? = unwrap(this).getAndOperator()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun tag(): Any? = unwrap(this).getTag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty
    }
  }

  public interface FilterAndOperatorProperty {
    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tags(): List<FilterTagProperty>

    @CdkDslMarker
    public interface Builder {
      public fun prefix(prefix: String)

      public fun tags(tags: List<FilterTagProperty>)

      public fun tags(vararg tags: FilterTagProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.builder()

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun tags(tags: List<FilterTagProperty>) {
        cdkBuilder.tags(tags.map(FilterTagProperty::unwrap))
      }

      override fun tags(vararg tags: FilterTagProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty,
    ) : CdkObject(cdkObject), FilterAndOperatorProperty {
      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun tags(): List<FilterTagProperty> =
          unwrap(this).getTags().map(FilterTagProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterAndOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty):
          FilterAndOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterAndOperatorProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty
    }
  }
}

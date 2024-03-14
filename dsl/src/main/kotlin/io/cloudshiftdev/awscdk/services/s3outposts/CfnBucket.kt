package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucket internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun bucketName(bucketName: String) {
    }

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
    }

    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit) {
    }

    public fun outpostId(outpostId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucket.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucket.Builder.create(scope, id)

    public override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    public override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    public override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    public override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun rules(rules: IResolvable) {
      }

      public fun rules(rules: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.builder()

      public override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      public override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty,
    ) : LifecycleConfigurationProperty {
      public override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterTagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty,
    ) : FilterTagProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty):
          FilterTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterTagProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
      }

      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit) {
      }

      public fun expirationDate(expirationDate: String) {
      }

      public fun expirationInDays(expirationInDays: Number) {
      }

      public fun filter(filter: Any) {
      }

      public fun id(id: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.builder()

      public override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable::unwrap))
      }

      public override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      public override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      public override fun expirationDate(expirationDate: String) {
        cdkBuilder.expirationDate(expirationDate)
      }

      public override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      public override fun filter(filter: Any) {
        cdkBuilder.filter(filter)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty,
    ) : RuleProperty {
      public override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      public override fun expirationDate(): String? = unwrap(this).getExpirationDate()

      public override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      public override fun filter(): Any? = unwrap(this).getFilter()

      public override fun id(): String? = unwrap(this).getId()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AbortIncompleteMultipartUploadProperty {
    public fun daysAfterInitiation(): Number

    public interface Builder {
      public fun daysAfterInitiation(daysAfterInitiation: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

      public override fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty,
    ) : AbortIncompleteMultipartUploadProperty {
      public override fun daysAfterInitiation(): Number = unwrap(this).getDaysAfterInitiation()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun andOperator(): Any? = unwrap(this).getAndOperator()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tag(): Any? = unwrap(this).getTag()

    public interface Builder {
      public fun andOperator(andOperator: IResolvable) {
      }

      public fun andOperator(andOperator: FilterAndOperatorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      public fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit) {
      }

      public fun prefix(prefix: String) {
      }

      public fun tag(tag: IResolvable) {
      }

      public fun tag(tag: FilterTagProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      public fun tag(tag: FilterTagProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.builder()

      public override fun andOperator(andOperator: IResolvable) {
        cdkBuilder.andOperator(andOperator.let(IResolvable::unwrap))
      }

      public override fun andOperator(andOperator: FilterAndOperatorProperty) {
        cdkBuilder.andOperator(andOperator.let(FilterAndOperatorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      public override fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit):
          Unit = andOperator(FilterAndOperatorProperty(andOperator))

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun tag(tag: IResolvable) {
        cdkBuilder.tag(tag.let(IResolvable::unwrap))
      }

      public override fun tag(tag: FilterTagProperty) {
        cdkBuilder.tag(tag.let(FilterTagProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      public override fun tag(tag: FilterTagProperty.Builder.() -> Unit): Unit =
          tag(FilterTagProperty(tag))

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty,
    ) : FilterProperty {
      public override fun andOperator(): Any? = unwrap(this).getAndOperator()

      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun tag(): Any? = unwrap(this).getTag()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilterAndOperatorProperty {
    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tags(): List<FilterTagProperty>

    public interface Builder {
      public fun prefix(prefix: String) {
      }

      public fun tags(tags: List<FilterTagProperty>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.builder()

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public override fun tags(tags: List<FilterTagProperty>) {
        cdkBuilder.tags(tags.map(FilterTagProperty::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty,
    ) : FilterAndOperatorProperty {
      public override fun prefix(): String? = unwrap(this).getPrefix()

      public override fun tags(): List<FilterTagProperty> =
          unwrap(this).getTags().map(FilterTagProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterAndOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty):
          FilterAndOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterAndOperatorProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}

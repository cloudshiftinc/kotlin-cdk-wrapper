package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceCollection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrResourceCollectionType(): String =
      unwrap(this).getAttrResourceCollectionType()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceCollectionFilter(): Any = unwrap(this).getResourceCollectionFilter()

  public open fun resourceCollectionFilter(`value`: IResolvable) {
    unwrap(this).setResourceCollectionFilter(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceCollectionFilter(`value`: ResourceCollectionFilterProperty) {
    unwrap(this).setResourceCollectionFilter(`value`.let(ResourceCollectionFilterProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6942d67cda36cba7675611fd73a2b21d0820a7aca0124d79e912360440e0f283")
  public open
      fun resourceCollectionFilter(`value`: ResourceCollectionFilterProperty.Builder.() -> Unit):
      Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(`value`))

  public interface Builder {
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
    }

    public
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    public
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder
        = software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder.create(scope, id)

    public override fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(IResolvable::unwrap))
    }

    public override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(ResourceCollectionFilterProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    public override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit):
        Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(resourceCollectionFilter))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnResourceCollection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection):
        CfnResourceCollection = CfnResourceCollection(cdkObject)

    internal fun unwrap(wrapped: CfnResourceCollection):
        software.amazon.awscdk.services.devopsguru.CfnResourceCollection = wrapped.cdkObject
  }

  public interface ResourceCollectionFilterProperty {
    public fun cloudFormation(): Any? = unwrap(this).getCloudFormation()

    public fun tags(): List<TagCollectionProperty> =
        unwrap(this).getTags()?.map(TagCollectionProperty::wrap) ?: emptyList()

    public interface Builder {
      public fun cloudFormation(cloudFormation: IResolvable) {
      }

      public fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      public
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit) {
      }

      public fun tags(tags: List<TagCollectionProperty>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.builder()

      public override fun cloudFormation(cloudFormation: IResolvable) {
        cdkBuilder.cloudFormation(cloudFormation.let(IResolvable::unwrap))
      }

      public override fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty) {
        cdkBuilder.cloudFormation(cloudFormation.let(CloudFormationCollectionFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      public override
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit):
          Unit = cloudFormation(CloudFormationCollectionFilterProperty(cloudFormation))

      public override fun tags(tags: List<TagCollectionProperty>) {
        cdkBuilder.tags(tags.map(TagCollectionProperty::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty,
    ) : ResourceCollectionFilterProperty {
      public override fun cloudFormation(): Any? = unwrap(this).getCloudFormation()

      public override fun tags(): List<TagCollectionProperty> =
          unwrap(this).getTags()?.map(TagCollectionProperty::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceCollectionFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty):
          ResourceCollectionFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCollectionFilterProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagCollectionProperty {
    public fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

    public fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()

    public interface Builder {
      public fun appBoundaryKey(appBoundaryKey: String) {
      }

      public fun tagValues(tagValues: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.builder()

      public override fun appBoundaryKey(appBoundaryKey: String) {
        cdkBuilder.appBoundaryKey(appBoundaryKey)
      }

      public override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty,
    ) : TagCollectionProperty {
      public override fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

      public override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagCollectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty):
          TagCollectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagCollectionProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudFormationCollectionFilterProperty {
    public fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()

    public interface Builder {
      public fun stackNames(stackNames: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.builder()

      public override fun stackNames(stackNames: List<String>) {
        cdkBuilder.stackNames(stackNames)
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty,
    ) : CloudFormationCollectionFilterProperty {
      public override fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudFormationCollectionFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty):
          CloudFormationCollectionFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudFormationCollectionFilterProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

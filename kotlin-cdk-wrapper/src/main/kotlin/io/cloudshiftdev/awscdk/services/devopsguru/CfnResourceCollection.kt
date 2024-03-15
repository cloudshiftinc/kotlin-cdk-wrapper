@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceCollection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6942d67cda36cba7675611fd73a2b21d0820a7aca0124d79e912360440e0f283")
  public open
      fun resourceCollectionFilter(`value`: ResourceCollectionFilterProperty.Builder.() -> Unit):
      Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable)

    public fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    public
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder
        = software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder.create(scope, id)

    override fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(IResolvable::unwrap))
    }

    override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(ResourceCollectionFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce7f67ffcf148b9ba6383e5387b87fd5722b6cc1d44fed30e7c22d56600d72a6")
    override
        fun resourceCollectionFilter(resourceCollectionFilter: ResourceCollectionFilterProperty.Builder.() -> Unit):
        Unit = resourceCollectionFilter(ResourceCollectionFilterProperty(resourceCollectionFilter))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnResourceCollection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun cloudFormation(cloudFormation: IResolvable)

      public fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      public
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit)

      public fun tags(tags: List<TagCollectionProperty>)

      public fun tags(vararg tags: TagCollectionProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.builder()

      override fun cloudFormation(cloudFormation: IResolvable) {
        cdkBuilder.cloudFormation(cloudFormation.let(IResolvable::unwrap))
      }

      override fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty) {
        cdkBuilder.cloudFormation(cloudFormation.let(CloudFormationCollectionFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("faf2ae5ed78f76a0f29173218ad7f0179c12baa26f29a6b136e98c2edb7849e2")
      override
          fun cloudFormation(cloudFormation: CloudFormationCollectionFilterProperty.Builder.() -> Unit):
          Unit = cloudFormation(CloudFormationCollectionFilterProperty(cloudFormation))

      override fun tags(tags: List<TagCollectionProperty>) {
        cdkBuilder.tags(tags.map(TagCollectionProperty::unwrap))
      }

      override fun tags(vararg tags: TagCollectionProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty,
    ) : CdkObject(cdkObject), ResourceCollectionFilterProperty {
      override fun cloudFormation(): Any? = unwrap(this).getCloudFormation()

      override fun tags(): List<TagCollectionProperty> =
          unwrap(this).getTags()?.map(TagCollectionProperty::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceCollectionFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty):
          ResourceCollectionFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCollectionFilterProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
    }
  }

  public interface TagCollectionProperty {
    public fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

    public fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun appBoundaryKey(appBoundaryKey: String)

      public fun tagValues(tagValues: List<String>)

      public fun tagValues(vararg tagValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty.builder()

      override fun appBoundaryKey(appBoundaryKey: String) {
        cdkBuilder.appBoundaryKey(appBoundaryKey)
      }

      override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty,
    ) : CdkObject(cdkObject), TagCollectionProperty {
      override fun appBoundaryKey(): String? = unwrap(this).getAppBoundaryKey()

      override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagCollectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty):
          TagCollectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagCollectionProperty):
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.TagCollectionProperty
    }
  }

  public interface CloudFormationCollectionFilterProperty {
    public fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun stackNames(stackNames: List<String>)

      public fun stackNames(vararg stackNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty.builder()

      override fun stackNames(stackNames: List<String>) {
        cdkBuilder.stackNames(stackNames)
      }

      override fun stackNames(vararg stackNames: String): Unit = stackNames(stackNames.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty,
    ) : CdkObject(cdkObject), CloudFormationCollectionFilterProperty {
      override fun stackNames(): List<String> = unwrap(this).getStackNames() ?: emptyList()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty
    }
  }
}

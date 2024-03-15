@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun dataFrequency(): String? = unwrap(this).getDataFrequency()

  public open fun dataFrequency(`value`: String) {
    unwrap(this).setDataFrequency(`value`)
  }

  public open fun datasetName(): String = unwrap(this).getDatasetName()

  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  public open fun datasetType(): String = unwrap(this).getDatasetType()

  public open fun datasetType(`value`: String) {
    unwrap(this).setDatasetType(`value`)
  }

  public open fun domain(): String = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public open fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  public open fun encryptionConfig(`value`: Any) {
    unwrap(this).setEncryptionConfig(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun schema(): Any = unwrap(this).getSchema()

  public open fun schema(`value`: Any) {
    unwrap(this).setSchema(`value`)
  }

  public open fun tags(): List<TagsItemsProperty> =
      unwrap(this).getTags()?.map(TagsItemsProperty::wrap) ?: emptyList()

  public open fun tags(`value`: List<TagsItemsProperty>) {
    unwrap(this).setTags(`value`.map(TagsItemsProperty::unwrap))
  }

  public open fun tags(vararg `value`: TagsItemsProperty): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dataFrequency(dataFrequency: String)

    public fun datasetName(datasetName: String)

    public fun datasetType(datasetType: String)

    public fun domain(domain: String)

    public fun encryptionConfig(encryptionConfig: Any)

    public fun schema(schema: Any)

    public fun tags(tags: List<TagsItemsProperty>)

    public fun tags(vararg tags: TagsItemsProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDataset.Builder =
        software.amazon.awscdk.services.forecast.CfnDataset.Builder.create(scope, id)

    override fun dataFrequency(dataFrequency: String) {
      cdkBuilder.dataFrequency(dataFrequency)
    }

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun encryptionConfig(encryptionConfig: Any) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    override fun tags(tags: List<TagsItemsProperty>) {
      cdkBuilder.tags(tags.map(TagsItemsProperty::unwrap))
    }

    override fun tags(vararg tags: TagsItemsProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.forecast.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset): CfnDataset =
        CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.forecast.CfnDataset =
        wrapped.cdkObject
  }

  public interface EncryptionConfigProperty {
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyArn(kmsKeyArn: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty,
    ) : CdkObject(cdkObject), EncryptionConfigProperty {
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty):
          EncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty
    }
  }

  public interface SchemaProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    @CdkDslMarker
    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: List<Any>)

      public fun attributes(vararg attributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      public fun build(): software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty,
    ) : CdkObject(cdkObject), SchemaProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty):
          SchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty
    }
  }

  public interface TagsItemsProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty,
    ) : CdkObject(cdkObject), TagsItemsProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty):
          TagsItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsItemsProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty
    }
  }

  public interface AttributesItemsProperty {
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    public fun attributeType(): String? = unwrap(this).getAttributeType()

    @CdkDslMarker
    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty,
    ) : CdkObject(cdkObject), AttributesItemsProperty {
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      override fun attributeType(): String? = unwrap(this).getAttributeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributesItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty):
          AttributesItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributesItemsProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty
    }
  }
}

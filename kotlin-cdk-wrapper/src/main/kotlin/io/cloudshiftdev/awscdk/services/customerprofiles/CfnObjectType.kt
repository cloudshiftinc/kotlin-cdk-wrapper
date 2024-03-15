@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnObjectType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

  public open fun allowProfileCreation(`value`: Boolean) {
    unwrap(this).setAllowProfileCreation(`value`)
  }

  public open fun allowProfileCreation(`value`: IResolvable) {
    unwrap(this).setAllowProfileCreation(`value`.let(IResolvable::unwrap))
  }

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  public open fun expirationDays(): Number? = unwrap(this).getExpirationDays()

  public open fun expirationDays(`value`: Number) {
    unwrap(this).setExpirationDays(`value`)
  }

  public open fun fields(): Any? = unwrap(this).getFields()

  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable::unwrap))
  }

  public open fun fields(__idx_ac66f0: List<Any>) {
    unwrap(this).setFields(__idx_ac66f0)
  }

  public open fun fields(vararg __idx_ac66f0: Any): Unit = fields(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keys(): Any? = unwrap(this).getKeys()

  public open fun keys(`value`: IResolvable) {
    unwrap(this).setKeys(`value`.let(IResolvable::unwrap))
  }

  public open fun keys(__idx_ac66f0: List<Any>) {
    unwrap(this).setKeys(__idx_ac66f0)
  }

  public open fun keys(vararg __idx_ac66f0: Any): Unit = keys(__idx_ac66f0.toList())

  public open fun objectTypeName(): String = unwrap(this).getObjectTypeName()

  public open fun objectTypeName(`value`: String) {
    unwrap(this).setObjectTypeName(`value`)
  }

  public open fun sourceLastUpdatedTimestampFormat(): String? =
      unwrap(this).getSourceLastUpdatedTimestampFormat()

  public open fun sourceLastUpdatedTimestampFormat(`value`: String) {
    unwrap(this).setSourceLastUpdatedTimestampFormat(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun templateId(): String? = unwrap(this).getTemplateId()

  public open fun templateId(`value`: String) {
    unwrap(this).setTemplateId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun allowProfileCreation(allowProfileCreation: Boolean)

    public fun allowProfileCreation(allowProfileCreation: IResolvable)

    public fun description(description: String)

    public fun domainName(domainName: String)

    public fun encryptionKey(encryptionKey: String)

    public fun expirationDays(expirationDays: Number)

    public fun fields(fields: IResolvable)

    public fun fields(fields: List<Any>)

    public fun fields(vararg fields: Any)

    public fun keys(keys: IResolvable)

    public fun keys(keys: List<Any>)

    public fun keys(vararg keys: Any)

    public fun objectTypeName(objectTypeName: String)

    public fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateId(templateId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder.create(scope, id)

    override fun allowProfileCreation(allowProfileCreation: Boolean) {
      cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    override fun allowProfileCreation(allowProfileCreation: IResolvable) {
      cdkBuilder.allowProfileCreation(allowProfileCreation.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    override fun expirationDays(expirationDays: Number) {
      cdkBuilder.expirationDays(expirationDays)
    }

    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    override fun keys(keys: IResolvable) {
      cdkBuilder.keys(keys.let(IResolvable::unwrap))
    }

    override fun keys(keys: List<Any>) {
      cdkBuilder.keys(keys)
    }

    override fun keys(vararg keys: Any): Unit = keys(keys.toList())

    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    override fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
      cdkBuilder.sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnObjectType =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnObjectType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnObjectType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnObjectType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType):
        CfnObjectType = CfnObjectType(cdkObject)

    internal fun unwrap(wrapped: CfnObjectType):
        software.amazon.awscdk.services.customerprofiles.CfnObjectType = wrapped.cdkObject
  }

  public interface ObjectTypeKeyProperty {
    public fun fieldNames(): List<String> = unwrap(this).getFieldNames() ?: emptyList()

    public fun standardIdentifiers(): List<String> = unwrap(this).getStandardIdentifiers() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun fieldNames(fieldNames: List<String>)

      public fun fieldNames(vararg fieldNames: String)

      public fun standardIdentifiers(standardIdentifiers: List<String>)

      public fun standardIdentifiers(vararg standardIdentifiers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.builder()

      override fun fieldNames(fieldNames: List<String>) {
        cdkBuilder.fieldNames(fieldNames)
      }

      override fun fieldNames(vararg fieldNames: String): Unit = fieldNames(fieldNames.toList())

      override fun standardIdentifiers(standardIdentifiers: List<String>) {
        cdkBuilder.standardIdentifiers(standardIdentifiers)
      }

      override fun standardIdentifiers(vararg standardIdentifiers: String): Unit =
          standardIdentifiers(standardIdentifiers.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty,
    ) : CdkObject(cdkObject), ObjectTypeKeyProperty {
      override fun fieldNames(): List<String> = unwrap(this).getFieldNames() ?: emptyList()

      override fun standardIdentifiers(): List<String> = unwrap(this).getStandardIdentifiers() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty):
          ObjectTypeKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeKeyProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty
    }
  }

  public interface FieldMapProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun objectTypeField(objectTypeField: IResolvable)

      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun objectTypeField(objectTypeField: IResolvable) {
        cdkBuilder.objectTypeField(objectTypeField.let(IResolvable::unwrap))
      }

      override fun objectTypeField(objectTypeField: ObjectTypeFieldProperty) {
        cdkBuilder.objectTypeField(objectTypeField.let(ObjectTypeFieldProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      override fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit):
          Unit = objectTypeField(ObjectTypeFieldProperty(objectTypeField))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty,
    ) : CdkObject(cdkObject), FieldMapProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty):
          FieldMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty
    }
  }

  public interface ObjectTypeFieldProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun source(): String? = unwrap(this).getSource()

    public fun target(): String? = unwrap(this).getTarget()

    @CdkDslMarker
    public interface Builder {
      public fun contentType(contentType: String)

      public fun source(source: String)

      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.builder()

      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty,
    ) : CdkObject(cdkObject), ObjectTypeFieldProperty {
      override fun contentType(): String? = unwrap(this).getContentType()

      override fun source(): String? = unwrap(this).getSource()

      override fun target(): String? = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty):
          ObjectTypeFieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeFieldProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty
    }
  }

  public interface KeyMapProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun objectTypeKeyList(objectTypeKeyList: IResolvable)

      public fun objectTypeKeyList(objectTypeKeyList: List<Any>)

      public fun objectTypeKeyList(vararg objectTypeKeyList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList.let(IResolvable::unwrap))
      }

      override fun objectTypeKeyList(objectTypeKeyList: List<Any>) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList)
      }

      override fun objectTypeKeyList(vararg objectTypeKeyList: Any): Unit =
          objectTypeKeyList(objectTypeKeyList.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty,
    ) : CdkObject(cdkObject), KeyMapProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty):
          KeyMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty
    }
  }
}

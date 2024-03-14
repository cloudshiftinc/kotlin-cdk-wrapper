package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnObjectType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType,
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

  public open fun templateId(): String? = unwrap(this).getTemplateId()

  public open fun templateId(`value`: String) {
    unwrap(this).setTemplateId(`value`)
  }

  public interface Builder {
    public fun allowProfileCreation(allowProfileCreation: Boolean) {
    }

    public fun allowProfileCreation(allowProfileCreation: IResolvable) {
    }

    public fun description(description: String) {
    }

    public fun domainName(domainName: String) {
    }

    public fun encryptionKey(encryptionKey: String) {
    }

    public fun expirationDays(expirationDays: Number) {
    }

    public fun fields(fields: IResolvable) {
    }

    public fun fields(fields: List<Any>) {
    }

    public fun keys(keys: IResolvable) {
    }

    public fun keys(keys: List<Any>) {
    }

    public fun objectTypeName(objectTypeName: String) {
    }

    public fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun templateId(templateId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder.create(scope, id)

    public override fun allowProfileCreation(allowProfileCreation: Boolean) {
      cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    public override fun allowProfileCreation(allowProfileCreation: IResolvable) {
      cdkBuilder.allowProfileCreation(allowProfileCreation.let(IResolvable::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    public override fun expirationDays(expirationDays: Number) {
      cdkBuilder.expirationDays(expirationDays)
    }

    public override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    public override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    public override fun keys(keys: IResolvable) {
      cdkBuilder.keys(keys.let(IResolvable::unwrap))
    }

    public override fun keys(keys: List<Any>) {
      cdkBuilder.keys(keys)
    }

    public override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    public override fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
      cdkBuilder.sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnObjectType =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun fieldNames(fieldNames: List<String>) {
      }

      public fun standardIdentifiers(standardIdentifiers: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.builder()

      public override fun fieldNames(fieldNames: List<String>) {
        cdkBuilder.fieldNames(fieldNames)
      }

      public override fun standardIdentifiers(standardIdentifiers: List<String>) {
        cdkBuilder.standardIdentifiers(standardIdentifiers)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty,
    ) : ObjectTypeKeyProperty {
      public override fun fieldNames(): List<String> = unwrap(this).getFieldNames() ?: emptyList()

      public override fun standardIdentifiers(): List<String> =
          unwrap(this).getStandardIdentifiers() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty):
          ObjectTypeKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeKeyProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldMapProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun objectTypeField(objectTypeField: IResolvable) {
      }

      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun objectTypeField(objectTypeField: IResolvable) {
        cdkBuilder.objectTypeField(objectTypeField.let(IResolvable::unwrap))
      }

      public override fun objectTypeField(objectTypeField: ObjectTypeFieldProperty) {
        cdkBuilder.objectTypeField(objectTypeField.let(ObjectTypeFieldProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      public override
          fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit): Unit =
          objectTypeField(ObjectTypeFieldProperty(objectTypeField))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty,
    ) : FieldMapProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty):
          FieldMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ObjectTypeFieldProperty {
    public fun contentType(): String? = unwrap(this).getContentType()

    public fun source(): String? = unwrap(this).getSource()

    public fun target(): String? = unwrap(this).getTarget()

    public interface Builder {
      public fun contentType(contentType: String) {
      }

      public fun source(source: String) {
      }

      public fun target(target: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.builder()

      public override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty,
    ) : ObjectTypeFieldProperty {
      public override fun contentType(): String? = unwrap(this).getContentType()

      public override fun source(): String? = unwrap(this).getSource()

      public override fun target(): String? = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty):
          ObjectTypeFieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeFieldProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyMapProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
      }

      public fun objectTypeKeyList(objectTypeKeyList: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList.let(IResolvable::unwrap))
      }

      public override fun objectTypeKeyList(objectTypeKeyList: List<Any>) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty,
    ) : KeyMapProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty):
          KeyMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}

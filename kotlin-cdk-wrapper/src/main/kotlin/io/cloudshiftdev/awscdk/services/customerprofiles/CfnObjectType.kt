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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an Amazon Connect Customer Profiles Object Type Mapping.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnObjectType cfnObjectType = CfnObjectType.Builder.create(this, "MyCfnObjectType")
 * .description("description")
 * .domainName("domainName")
 * .objectTypeName("objectTypeName")
 * // the properties below are optional
 * .allowProfileCreation(false)
 * .encryptionKey("encryptionKey")
 * .expirationDays(123)
 * .fields(List.of(FieldMapProperty.builder()
 * .name("name")
 * .objectTypeField(ObjectTypeFieldProperty.builder()
 * .contentType("contentType")
 * .source("source")
 * .target("target")
 * .build())
 * .build()))
 * .keys(List.of(KeyMapProperty.builder()
 * .name("name")
 * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
 * .fieldNames(List.of("fieldNames"))
 * .standardIdentifiers(List.of("standardIdentifiers"))
 * .build()))
 * .build()))
 * .sourceLastUpdatedTimestampFormat("sourceLastUpdatedTimestampFormat")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateId("templateId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html)
 */
public open class CfnObjectType(
  cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnObjectTypeProps,
  ) :
      this(software.amazon.awscdk.services.customerprofiles.CfnObjectType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnObjectTypeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnObjectTypeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnObjectTypeProps(props)
  )

  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   */
  public open fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   */
  public open fun allowProfileCreation(`value`: Boolean) {
    unwrap(this).setAllowProfileCreation(`value`)
  }

  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   */
  public open fun allowProfileCreation(`value`: IResolvable) {
    unwrap(this).setAllowProfileCreation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The timestamp of when the object type was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The timestamp of when the object type was most recently edited.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The description of the profile object type mapping.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description of the profile object type mapping.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The customer-provided key to encrypt the profile object that will be created in this profile
   * object type mapping.
   */
  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The customer-provided key to encrypt the profile object that will be created in this profile
   * object type mapping.
   */
  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  /**
   * The number of days until the data of this type expires.
   */
  public open fun expirationDays(): Number? = unwrap(this).getExpirationDays()

  /**
   * The number of days until the data of this type expires.
   */
  public open fun expirationDays(`value`: Number) {
    unwrap(this).setExpirationDays(`value`)
  }

  /**
   * A list of field definitions for the object type mapping.
   */
  public open fun fields(): Any? = unwrap(this).getFields()

  /**
   * A list of field definitions for the object type mapping.
   */
  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of field definitions for the object type mapping.
   */
  public open fun fields(`value`: List<Any>) {
    unwrap(this).setFields(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of field definitions for the object type mapping.
   */
  public open fun fields(vararg `value`: Any): Unit = fields(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   */
  public open fun keys(): Any? = unwrap(this).getKeys()

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   */
  public open fun keys(`value`: IResolvable) {
    unwrap(this).setKeys(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   */
  public open fun keys(`value`: List<Any>) {
    unwrap(this).setKeys(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   */
  public open fun keys(vararg `value`: Any): Unit = keys(`value`.toList())

  /**
   * The name of the profile object type.
   */
  public open fun objectTypeName(): String = unwrap(this).getObjectTypeName()

  /**
   * The name of the profile object type.
   */
  public open fun objectTypeName(`value`: String) {
    unwrap(this).setObjectTypeName(`value`)
  }

  /**
   * The format of your sourceLastUpdatedTimestamp that was previously set up.
   */
  public open fun sourceLastUpdatedTimestampFormat(): String? =
      unwrap(this).getSourceLastUpdatedTimestampFormat()

  /**
   * The format of your sourceLastUpdatedTimestamp that was previously set up.
   */
  public open fun sourceLastUpdatedTimestampFormat(`value`: String) {
    unwrap(this).setSourceLastUpdatedTimestampFormat(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A unique identifier for the template mapping.
   */
  public open fun templateId(): String? = unwrap(this).getTemplateId()

  /**
   * A unique identifier for the template mapping.
   */
  public open fun templateId(`value`: String) {
    unwrap(this).setTemplateId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnObjectType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether a profile should be created when data is received if one doesn’t exist for
     * an object of this type.
     *
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type. 
     */
    public fun allowProfileCreation(allowProfileCreation: Boolean)

    /**
     * Indicates whether a profile should be created when data is received if one doesn’t exist for
     * an object of this type.
     *
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type. 
     */
    public fun allowProfileCreation(allowProfileCreation: IResolvable)

    /**
     * The description of the profile object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-description)
     * @param description The description of the profile object type mapping. 
     */
    public fun description(description: String)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The customer-provided key to encrypt the profile object that will be created in this profile
     * object type mapping.
     *
     * If not specified the system will use the encryption key of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-encryptionkey)
     * @param encryptionKey The customer-provided key to encrypt the profile object that will be
     * created in this profile object type mapping. 
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * The number of days until the data of this type expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-expirationdays)
     * @param expirationDays The number of days until the data of this type expires. 
     */
    public fun expirationDays(expirationDays: Number)

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    public fun fields(fields: IResolvable)

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    public fun fields(fields: List<Any>)

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    public fun fields(vararg fields: Any)

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    public fun keys(keys: IResolvable)

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    public fun keys(keys: List<Any>)

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    public fun keys(vararg keys: Any)

    /**
     * The name of the profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-objecttypename)
     * @param objectTypeName The name of the profile object type. 
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * The format of your sourceLastUpdatedTimestamp that was previously set up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-sourcelastupdatedtimestampformat)
     * @param sourceLastUpdatedTimestampFormat The format of your sourceLastUpdatedTimestamp that
     * was previously set up. 
     */
    public fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A unique identifier for the template mapping.
     *
     * This can be used instead of specifying the Keys and Fields properties directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-templateid)
     * @param templateId A unique identifier for the template mapping. 
     */
    public fun templateId(templateId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnObjectType.Builder.create(scope, id)

    /**
     * Indicates whether a profile should be created when data is received if one doesn’t exist for
     * an object of this type.
     *
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type. 
     */
    override fun allowProfileCreation(allowProfileCreation: Boolean) {
      cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    /**
     * Indicates whether a profile should be created when data is received if one doesn’t exist for
     * an object of this type.
     *
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type. 
     */
    override fun allowProfileCreation(allowProfileCreation: IResolvable) {
      cdkBuilder.allowProfileCreation(allowProfileCreation.let(IResolvable.Companion::unwrap))
    }

    /**
     * The description of the profile object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-description)
     * @param description The description of the profile object type mapping. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The customer-provided key to encrypt the profile object that will be created in this profile
     * object type mapping.
     *
     * If not specified the system will use the encryption key of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-encryptionkey)
     * @param encryptionKey The customer-provided key to encrypt the profile object that will be
     * created in this profile object type mapping. 
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The number of days until the data of this type expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-expirationdays)
     * @param expirationDays The number of days until the data of this type expires. 
     */
    override fun expirationDays(expirationDays: Number) {
      cdkBuilder.expirationDays(expirationDays)
    }

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     * @param fields A list of field definitions for the object type mapping. 
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    override fun keys(keys: IResolvable) {
      cdkBuilder.keys(keys.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    override fun keys(keys: List<Any>) {
      cdkBuilder.keys(keys.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile. 
     */
    override fun keys(vararg keys: Any): Unit = keys(keys.toList())

    /**
     * The name of the profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-objecttypename)
     * @param objectTypeName The name of the profile object type. 
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * The format of your sourceLastUpdatedTimestamp that was previously set up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-sourcelastupdatedtimestampformat)
     * @param sourceLastUpdatedTimestampFormat The format of your sourceLastUpdatedTimestamp that
     * was previously set up. 
     */
    override fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
      cdkBuilder.sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A unique identifier for the template mapping.
     *
     * This can be used instead of specifying the Keys and Fields properties directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-templateid)
     * @param templateId A unique identifier for the template mapping. 
     */
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
        software.amazon.awscdk.services.customerprofiles.CfnObjectType = wrapped.cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnObjectType
  }

  /**
   * A map of the name and ObjectType field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * FieldMapProperty fieldMapProperty = FieldMapProperty.builder()
   * .name("name")
   * .objectTypeField(ObjectTypeFieldProperty.builder()
   * .contentType("contentType")
   * .source("source")
   * .target("target")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html)
   */
  public interface FieldMapProperty {
    /**
     * Name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html#cfn-customerprofiles-objecttype-fieldmap-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Represents a field in a ProfileObjectType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html#cfn-customerprofiles-objecttype-fieldmap-objecttypefield)
     */
    public fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()

    /**
     * A builder for [FieldMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of the field.
       */
      public fun name(name: String)

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      public fun objectTypeField(objectTypeField: IResolvable)

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty)

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      public fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.builder()

      /**
       * @param name Name of the field.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      override fun objectTypeField(objectTypeField: IResolvable) {
        cdkBuilder.objectTypeField(objectTypeField.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      override fun objectTypeField(objectTypeField: ObjectTypeFieldProperty) {
        cdkBuilder.objectTypeField(objectTypeField.let(ObjectTypeFieldProperty.Companion::unwrap))
      }

      /**
       * @param objectTypeField Represents a field in a ProfileObjectType.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a36b474874f8982034c00f59853506f065262c2bd05f5ce8aa93d6089d5ceb5")
      override fun objectTypeField(objectTypeField: ObjectTypeFieldProperty.Builder.() -> Unit):
          Unit = objectTypeField(ObjectTypeFieldProperty(objectTypeField))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty,
    ) : CdkObject(cdkObject), FieldMapProperty {
      /**
       * Name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html#cfn-customerprofiles-objecttype-fieldmap-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Represents a field in a ProfileObjectType.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html#cfn-customerprofiles-objecttype-fieldmap-objecttypefield)
       */
      override fun objectTypeField(): Any? = unwrap(this).getObjectTypeField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty):
          FieldMapProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldMapProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty
    }
  }

  /**
   * A unique key map that can be used to map data to the profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * KeyMapProperty keyMapProperty = KeyMapProperty.builder()
   * .name("name")
   * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
   * .fieldNames(List.of("fieldNames"))
   * .standardIdentifiers(List.of("standardIdentifiers"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html)
   */
  public interface KeyMapProperty {
    /**
     * Name of the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html#cfn-customerprofiles-objecttype-keymap-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A list of ObjectTypeKey.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html#cfn-customerprofiles-objecttype-keymap-objecttypekeylist)
     */
    public fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()

    /**
     * A builder for [KeyMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of the key.
       */
      public fun name(name: String)

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      public fun objectTypeKeyList(objectTypeKeyList: IResolvable)

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      public fun objectTypeKeyList(objectTypeKeyList: List<Any>)

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      public fun objectTypeKeyList(vararg objectTypeKeyList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty.builder()

      /**
       * @param name Name of the key.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      override fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      override fun objectTypeKeyList(objectTypeKeyList: List<Any>) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param objectTypeKeyList A list of ObjectTypeKey.
       */
      override fun objectTypeKeyList(vararg objectTypeKeyList: Any): Unit =
          objectTypeKeyList(objectTypeKeyList.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty,
    ) : CdkObject(cdkObject), KeyMapProperty {
      /**
       * Name of the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html#cfn-customerprofiles-objecttype-keymap-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A list of ObjectTypeKey.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html#cfn-customerprofiles-objecttype-keymap-objecttypekeylist)
       */
      override fun objectTypeKeyList(): Any? = unwrap(this).getObjectTypeKeyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty):
          KeyMapProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyMapProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.KeyMapProperty
    }
  }

  /**
   * Represents a field in a ProfileObjectType.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ObjectTypeFieldProperty objectTypeFieldProperty = ObjectTypeFieldProperty.builder()
   * .contentType("contentType")
   * .source("source")
   * .target("target")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html)
   */
  public interface ObjectTypeFieldProperty {
    /**
     * The content type of the field.
     *
     * Used for determining equality when searching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * A field of a ProfileObject.
     *
     * For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user and
     * “FirstName” is a field in that ObjectType.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * The location of the data in the standard ProfileObject model.
     *
     * For example: _profile.Address.PostalCode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-target)
     */
    public fun target(): String? = unwrap(this).getTarget()

    /**
     * A builder for [ObjectTypeFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentType The content type of the field.
       * Used for determining equality when searching.
       */
      public fun contentType(contentType: String)

      /**
       * @param source A field of a ProfileObject.
       * For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user
       * and “FirstName” is a field in that ObjectType.
       */
      public fun source(source: String)

      /**
       * @param target The location of the data in the standard ProfileObject model.
       * For example: _profile.Address.PostalCode.
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty.builder()

      /**
       * @param contentType The content type of the field.
       * Used for determining equality when searching.
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param source A field of a ProfileObject.
       * For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user
       * and “FirstName” is a field in that ObjectType.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The location of the data in the standard ProfileObject model.
       * For example: _profile.Address.PostalCode.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty,
    ) : CdkObject(cdkObject), ObjectTypeFieldProperty {
      /**
       * The content type of the field.
       *
       * Used for determining equality when searching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()

      /**
       * A field of a ProfileObject.
       *
       * For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user
       * and “FirstName” is a field in that ObjectType.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-source)
       */
      override fun source(): String? = unwrap(this).getSource()

      /**
       * The location of the data in the standard ProfileObject model.
       *
       * For example: _profile.Address.PostalCode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html#cfn-customerprofiles-objecttype-objecttypefield-target)
       */
      override fun target(): String? = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty):
          ObjectTypeFieldProperty = CdkObjectWrappers.wrap(cdkObject) as? ObjectTypeFieldProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeFieldProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty
    }
  }

  /**
   * An object that defines the Key element of a ProfileObject.
   *
   * A Key is a special element that can be used to search for a customer profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ObjectTypeKeyProperty objectTypeKeyProperty = ObjectTypeKeyProperty.builder()
   * .fieldNames(List.of("fieldNames"))
   * .standardIdentifiers(List.of("standardIdentifiers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html)
   */
  public interface ObjectTypeKeyProperty {
    /**
     * The reference for the key name of the fields map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html#cfn-customerprofiles-objecttype-objecttypekey-fieldnames)
     */
    public fun fieldNames(): List<String> = unwrap(this).getFieldNames() ?: emptyList()

    /**
     * The types of keys that a ProfileObject can have.
     *
     * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
     * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely
     * identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles
     * after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a
     * profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only
     * used if the profile does not already exist before the object is ingested, otherwise it is only
     * used for matching objects to profiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html#cfn-customerprofiles-objecttype-objecttypekey-standardidentifiers)
     */
    public fun standardIdentifiers(): List<String> = unwrap(this).getStandardIdentifiers() ?:
        emptyList()

    /**
     * A builder for [ObjectTypeKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldNames The reference for the key name of the fields map.
       */
      public fun fieldNames(fieldNames: List<String>)

      /**
       * @param fieldNames The reference for the key name of the fields map.
       */
      public fun fieldNames(vararg fieldNames: String)

      /**
       * @param standardIdentifiers The types of keys that a ProfileObject can have.
       * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
       * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to
       * uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for
       * profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
       * match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key
       * is only used if the profile does not already exist before the object is ingested, otherwise it
       * is only used for matching objects to profiles.
       */
      public fun standardIdentifiers(standardIdentifiers: List<String>)

      /**
       * @param standardIdentifiers The types of keys that a ProfileObject can have.
       * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
       * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to
       * uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for
       * profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
       * match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key
       * is only used if the profile does not already exist before the object is ingested, otherwise it
       * is only used for matching objects to profiles.
       */
      public fun standardIdentifiers(vararg standardIdentifiers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty.builder()

      /**
       * @param fieldNames The reference for the key name of the fields map.
       */
      override fun fieldNames(fieldNames: List<String>) {
        cdkBuilder.fieldNames(fieldNames)
      }

      /**
       * @param fieldNames The reference for the key name of the fields map.
       */
      override fun fieldNames(vararg fieldNames: String): Unit = fieldNames(fieldNames.toList())

      /**
       * @param standardIdentifiers The types of keys that a ProfileObject can have.
       * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
       * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to
       * uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for
       * profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
       * match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key
       * is only used if the profile does not already exist before the object is ingested, otherwise it
       * is only used for matching objects to profiles.
       */
      override fun standardIdentifiers(standardIdentifiers: List<String>) {
        cdkBuilder.standardIdentifiers(standardIdentifiers)
      }

      /**
       * @param standardIdentifiers The types of keys that a ProfileObject can have.
       * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
       * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to
       * uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for
       * profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
       * match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key
       * is only used if the profile does not already exist before the object is ingested, otherwise it
       * is only used for matching objects to profiles.
       */
      override fun standardIdentifiers(vararg standardIdentifiers: String): Unit =
          standardIdentifiers(standardIdentifiers.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty,
    ) : CdkObject(cdkObject), ObjectTypeKeyProperty {
      /**
       * The reference for the key name of the fields map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html#cfn-customerprofiles-objecttype-objecttypekey-fieldnames)
       */
      override fun fieldNames(): List<String> = unwrap(this).getFieldNames() ?: emptyList()

      /**
       * The types of keys that a ProfileObject can have.
       *
       * Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that
       * this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to
       * uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for
       * profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to
       * match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key
       * is only used if the profile does not already exist before the object is ingested, otherwise it
       * is only used for matching objects to profiles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html#cfn-customerprofiles-objecttype-objecttypekey-standardidentifiers)
       */
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
          ObjectTypeKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? ObjectTypeKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeKeyProperty):
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeKeyProperty
    }
  }
}

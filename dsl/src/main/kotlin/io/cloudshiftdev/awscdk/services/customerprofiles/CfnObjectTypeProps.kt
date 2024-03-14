package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnObjectTypeProps {
  /**
   * Indicates whether a profile should be created when data is received if one doesn’t exist for an
   * object of this type.
   *
   * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the service
   * tries to fetch a standard profile and associate this object with the profile. If it is set to
   * `TRUE` , and if no match is found, then the service creates a new standard profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
   */
  public fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

  /**
   * The description of the profile object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-description)
   */
  public fun description(): String

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-domainname)
   */
  public fun domainName(): String

  /**
   * The customer-provided key to encrypt the profile object that will be created in this profile
   * object type mapping.
   *
   * If not specified the system will use the encryption key of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-encryptionkey)
   */
  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The number of days until the data of this type expires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-expirationdays)
   */
  public fun expirationDays(): Number? = unwrap(this).getExpirationDays()

  /**
   * A list of field definitions for the object type mapping.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
   */
  public fun fields(): Any? = unwrap(this).getFields()

  /**
   * A list of keys that can be used to map data to the profile or search for the profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
   */
  public fun keys(): Any? = unwrap(this).getKeys()

  /**
   * The name of the profile object type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-objecttypename)
   */
  public fun objectTypeName(): String

  /**
   * The format of your sourceLastUpdatedTimestamp that was previously set up.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-sourcelastupdatedtimestampformat)
   */
  public fun sourceLastUpdatedTimestampFormat(): String? =
      unwrap(this).getSourceLastUpdatedTimestampFormat()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A unique identifier for the template mapping.
   *
   * This can be used instead of specifying the Keys and Fields properties directly.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-templateid)
   */
  public fun templateId(): String? = unwrap(this).getTemplateId()

  /**
   * A builder for [CfnObjectTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type.
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     */
    public fun allowProfileCreation(allowProfileCreation: Boolean)

    /**
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type.
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     */
    public fun allowProfileCreation(allowProfileCreation: IResolvable)

    /**
     * @param description The description of the profile object type mapping. 
     */
    public fun description(description: String)

    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param encryptionKey The customer-provided key to encrypt the profile object that will be
     * created in this profile object type mapping.
     * If not specified the system will use the encryption key of the domain.
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * @param expirationDays The number of days until the data of this type expires.
     */
    public fun expirationDays(expirationDays: Number)

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    public fun fields(fields: IResolvable)

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    public fun fields(fields: List<Any>)

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    public fun fields(vararg fields: Any)

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    public fun keys(keys: IResolvable)

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    public fun keys(keys: List<Any>)

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    public fun keys(vararg keys: Any)

    /**
     * @param objectTypeName The name of the profile object type. 
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * @param sourceLastUpdatedTimestampFormat The format of your sourceLastUpdatedTimestamp that
     * was previously set up.
     */
    public fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param templateId A unique identifier for the template mapping.
     * This can be used instead of specifying the Keys and Fields properties directly.
     */
    public fun templateId(templateId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps.builder()

    /**
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type.
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     */
    override fun allowProfileCreation(allowProfileCreation: Boolean) {
      cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    /**
     * @param allowProfileCreation Indicates whether a profile should be created when data is
     * received if one doesn’t exist for an object of this type.
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     */
    override fun allowProfileCreation(allowProfileCreation: IResolvable) {
      cdkBuilder.allowProfileCreation(allowProfileCreation.let(IResolvable::unwrap))
    }

    /**
     * @param description The description of the profile object type mapping. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param encryptionKey The customer-provided key to encrypt the profile object that will be
     * created in this profile object type mapping.
     * If not specified the system will use the encryption key of the domain.
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param expirationDays The number of days until the data of this type expires.
     */
    override fun expirationDays(expirationDays: Number) {
      cdkBuilder.expirationDays(expirationDays)
    }

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    /**
     * @param fields A list of field definitions for the object type mapping.
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    override fun keys(keys: IResolvable) {
      cdkBuilder.keys(keys.let(IResolvable::unwrap))
    }

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    override fun keys(keys: List<Any>) {
      cdkBuilder.keys(keys)
    }

    /**
     * @param keys A list of keys that can be used to map data to the profile or search for the
     * profile.
     */
    override fun keys(vararg keys: Any): Unit = keys(keys.toList())

    /**
     * @param objectTypeName The name of the profile object type. 
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * @param sourceLastUpdatedTimestampFormat The format of your sourceLastUpdatedTimestamp that
     * was previously set up.
     */
    override fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
      cdkBuilder.sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param templateId A unique identifier for the template mapping.
     * This can be used instead of specifying the Keys and Fields properties directly.
     */
    override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps,
  ) : CdkObject(cdkObject), CfnObjectTypeProps {
    /**
     * Indicates whether a profile should be created when data is received if one doesn’t exist for
     * an object of this type.
     *
     * The default is `FALSE` . If the AllowProfileCreation flag is set to `FALSE` , then the
     * service tries to fetch a standard profile and associate this object with the profile. If it is
     * set to `TRUE` , and if no match is found, then the service creates a new standard profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-allowprofilecreation)
     */
    override fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

    /**
     * The description of the profile object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The customer-provided key to encrypt the profile object that will be created in this profile
     * object type mapping.
     *
     * If not specified the system will use the encryption key of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-encryptionkey)
     */
    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The number of days until the data of this type expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-expirationdays)
     */
    override fun expirationDays(): Number? = unwrap(this).getExpirationDays()

    /**
     * A list of field definitions for the object type mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-fields)
     */
    override fun fields(): Any? = unwrap(this).getFields()

    /**
     * A list of keys that can be used to map data to the profile or search for the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-keys)
     */
    override fun keys(): Any? = unwrap(this).getKeys()

    /**
     * The name of the profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-objecttypename)
     */
    override fun objectTypeName(): String = unwrap(this).getObjectTypeName()

    /**
     * The format of your sourceLastUpdatedTimestamp that was previously set up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-sourcelastupdatedtimestampformat)
     */
    override fun sourceLastUpdatedTimestampFormat(): String? =
        unwrap(this).getSourceLastUpdatedTimestampFormat()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A unique identifier for the template mapping.
     *
     * This can be used instead of specifying the Keys and Fields properties directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html#cfn-customerprofiles-objecttype-templateid)
     */
    override fun templateId(): String? = unwrap(this).getTemplateId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnObjectTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps):
        CfnObjectTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnObjectTypeProps):
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
 * CfnProfile cfnProfile = CfnProfile.Builder.create(this, "MyCfnProfile")
 * .name("name")
 * .roleArns(List.of("roleArns"))
 * // the properties below are optional
 * .acceptRoleSessionName(false)
 * .attributeMappings(List.of(AttributeMappingProperty.builder()
 * .certificateField("certificateField")
 * .mappingRules(List.of(MappingRuleProperty.builder()
 * .specifier("specifier")
 * .build()))
 * .build()))
 * .durationSeconds(123)
 * .enabled(false)
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .requireInstanceProperties(false)
 * .sessionPolicy("sessionPolicy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html)
 */
public open class CfnProfile(
  cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileProps,
  ) :
      this(software.amazon.awscdk.services.rolesanywhere.CfnProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProfileProps(props)
  )

  /**
   * Used to determine if a custom role session name will be accepted in a temporary credential
   * request.
   */
  public open fun acceptRoleSessionName(): Any? = unwrap(this).getAcceptRoleSessionName()

  /**
   * Used to determine if a custom role session name will be accepted in a temporary credential
   * request.
   */
  public open fun acceptRoleSessionName(`value`: Boolean) {
    unwrap(this).setAcceptRoleSessionName(`value`)
  }

  /**
   * Used to determine if a custom role session name will be accepted in a temporary credential
   * request.
   */
  public open fun acceptRoleSessionName(`value`: IResolvable) {
    unwrap(this).setAcceptRoleSessionName(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ARN of the profile.
   */
  public open fun attrProfileArn(): String = unwrap(this).getAttrProfileArn()

  /**
   * The unique primary identifier of the Profile.
   */
  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  /**
   * A mapping applied to the authenticating end-entity certificate.
   */
  public open fun attributeMappings(): Any? = unwrap(this).getAttributeMappings()

  /**
   * A mapping applied to the authenticating end-entity certificate.
   */
  public open fun attributeMappings(`value`: IResolvable) {
    unwrap(this).setAttributeMappings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A mapping applied to the authenticating end-entity certificate.
   */
  public open fun attributeMappings(`value`: List<Any>) {
    unwrap(this).setAttributeMappings(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A mapping applied to the authenticating end-entity certificate.
   */
  public open fun attributeMappings(vararg `value`: Any): Unit = attributeMappings(`value`.toList())

  /**
   * The number of seconds vended session credentials will be valid for.
   */
  public open fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

  /**
   * The number of seconds vended session credentials will be valid for.
   */
  public open fun durationSeconds(`value`: Number) {
    unwrap(this).setDurationSeconds(`value`)
  }

  /**
   * The enabled status of the resource.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The enabled status of the resource.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * The enabled status of the resource.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of managed policy ARNs.
   */
  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  /**
   * A list of managed policy ARNs.
   */
  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  /**
   * A list of managed policy ARNs.
   */
  public open fun managedPolicyArns(vararg `value`: String): Unit =
      managedPolicyArns(`value`.toList())

  /**
   * The customer specified name of the resource.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The customer specified name of the resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies whether instance properties are required in CreateSession requests with this profile.
   */
  public open fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

  /**
   * Specifies whether instance properties are required in CreateSession requests with this profile.
   */
  public open fun requireInstanceProperties(`value`: Boolean) {
    unwrap(this).setRequireInstanceProperties(`value`)
  }

  /**
   * Specifies whether instance properties are required in CreateSession requests with this profile.
   */
  public open fun requireInstanceProperties(`value`: IResolvable) {
    unwrap(this).setRequireInstanceProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
   * request.
   */
  public open fun roleArns(): List<String> = unwrap(this).getRoleArns()

  /**
   * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
   * request.
   */
  public open fun roleArns(`value`: List<String>) {
    unwrap(this).setRoleArns(`value`)
  }

  /**
   * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
   * request.
   */
  public open fun roleArns(vararg `value`: String): Unit = roleArns(`value`.toList())

  /**
   * A session policy that will applied to the trust boundary of the vended session credentials.
   */
  public open fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

  /**
   * A session policy that will applied to the trust boundary of the vended session credentials.
   */
  public open fun sessionPolicy(`value`: String) {
    unwrap(this).setSessionPolicy(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of Tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of Tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of Tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rolesanywhere.CfnProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Used to determine if a custom role session name will be accepted in a temporary credential
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-acceptrolesessionname)
     * @param acceptRoleSessionName Used to determine if a custom role session name will be accepted
     * in a temporary credential request. 
     */
    public fun acceptRoleSessionName(acceptRoleSessionName: Boolean)

    /**
     * Used to determine if a custom role session name will be accepted in a temporary credential
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-acceptrolesessionname)
     * @param acceptRoleSessionName Used to determine if a custom role session name will be accepted
     * in a temporary credential request. 
     */
    public fun acceptRoleSessionName(acceptRoleSessionName: IResolvable)

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    public fun attributeMappings(attributeMappings: IResolvable)

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    public fun attributeMappings(attributeMappings: List<Any>)

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    public fun attributeMappings(vararg attributeMappings: Any)

    /**
     * The number of seconds vended session credentials will be valid for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-durationseconds)
     * @param durationSeconds The number of seconds vended session credentials will be valid for. 
     */
    public fun durationSeconds(durationSeconds: Number)

    /**
     * The enabled status of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
     * @param enabled The enabled status of the resource. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The enabled status of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
     * @param enabled The enabled status of the resource. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * A list of managed policy ARNs.
     *
     * Managed policies identified by this list will be applied to the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
     * @param managedPolicyArns A list of managed policy ARNs. 
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * A list of managed policy ARNs.
     *
     * Managed policies identified by this list will be applied to the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
     * @param managedPolicyArns A list of managed policy ARNs. 
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

    /**
     * The customer specified name of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-name)
     * @param name The customer specified name of the resource. 
     */
    public fun name(name: String)

    /**
     * Specifies whether instance properties are required in CreateSession requests with this
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile. 
     */
    public fun requireInstanceProperties(requireInstanceProperties: Boolean)

    /**
     * Specifies whether instance properties are required in CreateSession requests with this
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile. 
     */
    public fun requireInstanceProperties(requireInstanceProperties: IResolvable)

    /**
     * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    public fun roleArns(roleArns: List<String>)

    /**
     * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    public fun roleArns(vararg roleArns: String)

    /**
     * A session policy that will applied to the trust boundary of the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-sessionpolicy)
     * @param sessionPolicy A session policy that will applied to the trust boundary of the vended
     * session credentials. 
     */
    public fun sessionPolicy(sessionPolicy: String)

    /**
     * A list of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
     * @param tags A list of Tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
     * @param tags A list of Tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnProfile.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnProfile.Builder.create(scope, id)

    /**
     * Used to determine if a custom role session name will be accepted in a temporary credential
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-acceptrolesessionname)
     * @param acceptRoleSessionName Used to determine if a custom role session name will be accepted
     * in a temporary credential request. 
     */
    override fun acceptRoleSessionName(acceptRoleSessionName: Boolean) {
      cdkBuilder.acceptRoleSessionName(acceptRoleSessionName)
    }

    /**
     * Used to determine if a custom role session name will be accepted in a temporary credential
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-acceptrolesessionname)
     * @param acceptRoleSessionName Used to determine if a custom role session name will be accepted
     * in a temporary credential request. 
     */
    override fun acceptRoleSessionName(acceptRoleSessionName: IResolvable) {
      cdkBuilder.acceptRoleSessionName(acceptRoleSessionName.let(IResolvable.Companion::unwrap))
    }

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    override fun attributeMappings(attributeMappings: IResolvable) {
      cdkBuilder.attributeMappings(attributeMappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    override fun attributeMappings(attributeMappings: List<Any>) {
      cdkBuilder.attributeMappings(attributeMappings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A mapping applied to the authenticating end-entity certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-attributemappings)
     * @param attributeMappings A mapping applied to the authenticating end-entity certificate. 
     */
    override fun attributeMappings(vararg attributeMappings: Any): Unit =
        attributeMappings(attributeMappings.toList())

    /**
     * The number of seconds vended session credentials will be valid for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-durationseconds)
     * @param durationSeconds The number of seconds vended session credentials will be valid for. 
     */
    override fun durationSeconds(durationSeconds: Number) {
      cdkBuilder.durationSeconds(durationSeconds)
    }

    /**
     * The enabled status of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
     * @param enabled The enabled status of the resource. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The enabled status of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
     * @param enabled The enabled status of the resource. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of managed policy ARNs.
     *
     * Managed policies identified by this list will be applied to the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
     * @param managedPolicyArns A list of managed policy ARNs. 
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * A list of managed policy ARNs.
     *
     * Managed policies identified by this list will be applied to the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
     * @param managedPolicyArns A list of managed policy ARNs. 
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    /**
     * The customer specified name of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-name)
     * @param name The customer specified name of the resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies whether instance properties are required in CreateSession requests with this
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile. 
     */
    override fun requireInstanceProperties(requireInstanceProperties: Boolean) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * Specifies whether instance properties are required in CreateSession requests with this
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile. 
     */
    override fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    override fun roleArns(roleArns: List<String>) {
      cdkBuilder.roleArns(roleArns)
    }

    /**
     * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    override fun roleArns(vararg roleArns: String): Unit = roleArns(roleArns.toList())

    /**
     * A session policy that will applied to the trust boundary of the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-sessionpolicy)
     * @param sessionPolicy A session policy that will applied to the trust boundary of the vended
     * session credentials. 
     */
    override fun sessionPolicy(sessionPolicy: String) {
      cdkBuilder.sessionPolicy(sessionPolicy)
    }

    /**
     * A list of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
     * @param tags A list of Tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
     * @param tags A list of Tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rolesanywhere.CfnProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile):
        CfnProfile = CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile):
        software.amazon.awscdk.services.rolesanywhere.CfnProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.rolesanywhere.CfnProfile
  }

  /**
   * A mapping applied to the authenticating end-entity certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
   * AttributeMappingProperty attributeMappingProperty = AttributeMappingProperty.builder()
   * .certificateField("certificateField")
   * .mappingRules(List.of(MappingRuleProperty.builder()
   * .specifier("specifier")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-attributemapping.html)
   */
  public interface AttributeMappingProperty {
    /**
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-attributemapping.html#cfn-rolesanywhere-profile-attributemapping-certificatefield)
     */
    public fun certificateField(): String

    /**
     * A list of mapping entries for every supported specifier or sub-field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-attributemapping.html#cfn-rolesanywhere-profile-attributemapping-mappingrules)
     */
    public fun mappingRules(): Any

    /**
     * A builder for [AttributeMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateField Fields (x509Subject, x509Issuer and x509SAN) within X.509
       * certificates. 
       */
      public fun certificateField(certificateField: String)

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      public fun mappingRules(mappingRules: IResolvable)

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      public fun mappingRules(mappingRules: List<Any>)

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      public fun mappingRules(vararg mappingRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty.Builder
          =
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty.builder()

      /**
       * @param certificateField Fields (x509Subject, x509Issuer and x509SAN) within X.509
       * certificates. 
       */
      override fun certificateField(certificateField: String) {
        cdkBuilder.certificateField(certificateField)
      }

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      override fun mappingRules(mappingRules: IResolvable) {
        cdkBuilder.mappingRules(mappingRules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      override fun mappingRules(mappingRules: List<Any>) {
        cdkBuilder.mappingRules(mappingRules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mappingRules A list of mapping entries for every supported specifier or sub-field. 
       */
      override fun mappingRules(vararg mappingRules: Any): Unit =
          mappingRules(mappingRules.toList())

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty,
    ) : CdkObject(cdkObject),
        AttributeMappingProperty {
      /**
       * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-attributemapping.html#cfn-rolesanywhere-profile-attributemapping-certificatefield)
       */
      override fun certificateField(): String = unwrap(this).getCertificateField()

      /**
       * A list of mapping entries for every supported specifier or sub-field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-attributemapping.html#cfn-rolesanywhere-profile-attributemapping-mappingrules)
       */
      override fun mappingRules(): Any = unwrap(this).getMappingRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty):
          AttributeMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeMappingProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeMappingProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.AttributeMappingProperty
    }
  }

  /**
   * A single mapping entry for each supported specifier or sub-field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
   * MappingRuleProperty mappingRuleProperty = MappingRuleProperty.builder()
   * .specifier("specifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-mappingrule.html)
   */
  public interface MappingRuleProperty {
    /**
     * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-mappingrule.html#cfn-rolesanywhere-profile-mappingrule-specifier)
     */
    public fun specifier(): String

    /**
     * A builder for [MappingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param specifier Specifier within a certificate field, such as CN, OU, or UID from the
       * Subject field. 
       */
      public fun specifier(specifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty.Builder =
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty.builder()

      /**
       * @param specifier Specifier within a certificate field, such as CN, OU, or UID from the
       * Subject field. 
       */
      override fun specifier(specifier: String) {
        cdkBuilder.specifier(specifier)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty,
    ) : CdkObject(cdkObject),
        MappingRuleProperty {
      /**
       * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-profile-mappingrule.html#cfn-rolesanywhere-profile-mappingrule-specifier)
       */
      override fun specifier(): String = unwrap(this).getSpecifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty):
          MappingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? MappingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingRuleProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rolesanywhere.CfnProfile.MappingRuleProperty
    }
  }
}

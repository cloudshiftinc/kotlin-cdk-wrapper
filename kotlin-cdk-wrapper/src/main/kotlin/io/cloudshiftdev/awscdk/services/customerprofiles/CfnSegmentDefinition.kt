@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A segment definition resource of Amazon Connect Customer Profiles.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnSegmentDefinition cfnSegmentDefinition = CfnSegmentDefinition.Builder.create(this,
 * "MyCfnSegmentDefinition")
 * .displayName("displayName")
 * .domainName("domainName")
 * .segmentDefinitionName("segmentDefinitionName")
 * .segmentGroups(SegmentGroupProperty.builder()
 * .groups(List.of(GroupProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .calculatedAttributes(Map.of(
 * "calculatedAttributesKey", CalculatedAttributeDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * // the properties below are optional
 * .conditionOverrides(ConditionOverridesProperty.builder()
 * .range(RangeOverrideProperty.builder()
 * .start(123)
 * .unit("unit")
 * // the properties below are optional
 * .end(123)
 * .build())
 * .build())
 * .build()))
 * .profileAttributes(ProfileAttributesProperty.builder()
 * .accountNumber(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .additionalInformation(ExtraLengthValueProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .address(AddressDimensionProperty.builder()
 * .city(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .country(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .county(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .postalCode(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .province(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .state(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build())
 * .attributes(Map.of(
 * "attributesKey", AttributeDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build()))
 * .billingAddress(AddressDimensionProperty.builder()
 * .city(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .country(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .county(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .postalCode(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .province(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .state(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build())
 * .birthDate(DateDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .businessEmailAddress(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .businessName(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .businessPhoneNumber(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .emailAddress(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .firstName(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .genderString(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .homePhoneNumber(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .lastName(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .mailingAddress(AddressDimensionProperty.builder()
 * .city(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .country(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .county(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .postalCode(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .province(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .state(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build())
 * .middleName(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .mobilePhoneNumber(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .partyTypeString(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .personalEmailAddress(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .phoneNumber(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .profileType(ProfileTypeDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .shippingAddress(AddressDimensionProperty.builder()
 * .city(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .country(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .county(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .postalCode(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .province(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .state(ProfileDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build())
 * .build())
 * .build()))
 * .sourceSegments(List.of(SourceSegmentProperty.builder()
 * .segmentDefinitionName("segmentDefinitionName")
 * .build()))
 * .sourceType("sourceType")
 * .type("type")
 * .build()))
 * .include("include")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html)
 */
public open class CfnSegmentDefinition(
  cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSegmentDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSegmentDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSegmentDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSegmentDefinitionProps(props)
  )

  /**
   * When the segment definition was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The arn of the segment definition.
   */
  public open fun attrSegmentDefinitionArn(): String = unwrap(this).getAttrSegmentDefinitionArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the segment definition.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the segment definition.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Display name of the segment definition.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * Display name of the segment definition.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
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
   * Name of the segment definition.
   */
  public open fun segmentDefinitionName(): String = unwrap(this).getSegmentDefinitionName()

  /**
   * Name of the segment definition.
   */
  public open fun segmentDefinitionName(`value`: String) {
    unwrap(this).setSegmentDefinitionName(`value`)
  }

  /**
   * Contains all groups of the segment definition.
   */
  public open fun segmentGroups(): Any = unwrap(this).getSegmentGroups()

  /**
   * Contains all groups of the segment definition.
   */
  public open fun segmentGroups(`value`: IResolvable) {
    unwrap(this).setSegmentGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains all groups of the segment definition.
   */
  public open fun segmentGroups(`value`: SegmentGroupProperty) {
    unwrap(this).setSegmentGroups(`value`.let(SegmentGroupProperty.Companion::unwrap))
  }

  /**
   * Contains all groups of the segment definition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c9a458dd5762e378e8c276a287dbe474c69f516c59cf50491a52a5559f28700")
  public open fun segmentGroups(`value`: SegmentGroupProperty.Builder.() -> Unit): Unit =
      segmentGroups(SegmentGroupProperty(`value`))

  /**
   * The tags belonging to the segment definition.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags belonging to the segment definition.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags belonging to the segment definition.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnSegmentDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-description)
     * @param description The description of the segment definition. 
     */
    public fun description(description: String)

    /**
     * Display name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-displayname)
     * @param displayName Display name of the segment definition. 
     */
    public fun displayName(displayName: String)

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-domainname)
     * @param domainName The name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * Name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentdefinitionname)
     * @param segmentDefinitionName Name of the segment definition. 
     */
    public fun segmentDefinitionName(segmentDefinitionName: String)

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    public fun segmentGroups(segmentGroups: IResolvable)

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    public fun segmentGroups(segmentGroups: SegmentGroupProperty)

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e6dcbc756c805523866585faa98a6b2bde8542bb62bc6388fbc26f3246a4869")
    public fun segmentGroups(segmentGroups: SegmentGroupProperty.Builder.() -> Unit)

    /**
     * The tags belonging to the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
     * @param tags The tags belonging to the segment definition. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags belonging to the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
     * @param tags The tags belonging to the segment definition. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.Builder.create(scope,
        id)

    /**
     * The description of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-description)
     * @param description The description of the segment definition. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Display name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-displayname)
     * @param displayName Display name of the segment definition. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-domainname)
     * @param domainName The name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * Name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentdefinitionname)
     * @param segmentDefinitionName Name of the segment definition. 
     */
    override fun segmentDefinitionName(segmentDefinitionName: String) {
      cdkBuilder.segmentDefinitionName(segmentDefinitionName)
    }

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    override fun segmentGroups(segmentGroups: IResolvable) {
      cdkBuilder.segmentGroups(segmentGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    override fun segmentGroups(segmentGroups: SegmentGroupProperty) {
      cdkBuilder.segmentGroups(segmentGroups.let(SegmentGroupProperty.Companion::unwrap))
    }

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e6dcbc756c805523866585faa98a6b2bde8542bb62bc6388fbc26f3246a4869")
    override fun segmentGroups(segmentGroups: SegmentGroupProperty.Builder.() -> Unit): Unit =
        segmentGroups(SegmentGroupProperty(segmentGroups))

    /**
     * The tags belonging to the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
     * @param tags The tags belonging to the segment definition. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags belonging to the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
     * @param tags The tags belonging to the segment definition. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSegmentDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSegmentDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition):
        CfnSegmentDefinition = CfnSegmentDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnSegmentDefinition):
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition
  }

  /**
   * Object that segments on Customer Profile's address object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AddressDimensionProperty addressDimensionProperty = AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html)
   */
  public interface AddressDimensionProperty {
    /**
     * The city belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-city)
     */
    public fun city(): Any? = unwrap(this).getCity()

    /**
     * The country belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-country)
     */
    public fun country(): Any? = unwrap(this).getCountry()

    /**
     * The county belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-county)
     */
    public fun county(): Any? = unwrap(this).getCounty()

    /**
     * The postal code belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-postalcode)
     */
    public fun postalCode(): Any? = unwrap(this).getPostalCode()

    /**
     * The province belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-province)
     */
    public fun province(): Any? = unwrap(this).getProvince()

    /**
     * The state belonging to the address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-state)
     */
    public fun state(): Any? = unwrap(this).getState()

    /**
     * A builder for [AddressDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param city The city belonging to the address.
       */
      public fun city(city: IResolvable)

      /**
       * @param city The city belonging to the address.
       */
      public fun city(city: ProfileDimensionProperty)

      /**
       * @param city The city belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffed14b57cc64205d8dbd2d312feb0523727b5d6b3a03e5345a0153dd0649e7a")
      public fun city(city: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param country The country belonging to the address.
       */
      public fun country(country: IResolvable)

      /**
       * @param country The country belonging to the address.
       */
      public fun country(country: ProfileDimensionProperty)

      /**
       * @param country The country belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8b0efb608406083ceb560c8086558342b475f233853b12339e199ee3699634")
      public fun country(country: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param county The county belonging to the address.
       */
      public fun county(county: IResolvable)

      /**
       * @param county The county belonging to the address.
       */
      public fun county(county: ProfileDimensionProperty)

      /**
       * @param county The county belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905d89eac611c4af713298b0b1b1ef9549916203edb931af854408b7d0a95784")
      public fun county(county: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param postalCode The postal code belonging to the address.
       */
      public fun postalCode(postalCode: IResolvable)

      /**
       * @param postalCode The postal code belonging to the address.
       */
      public fun postalCode(postalCode: ProfileDimensionProperty)

      /**
       * @param postalCode The postal code belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbd1e7335883c6724ca5987de6067a44c5fd941db4fb01169c979e46df641b4c")
      public fun postalCode(postalCode: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param province The province belonging to the address.
       */
      public fun province(province: IResolvable)

      /**
       * @param province The province belonging to the address.
       */
      public fun province(province: ProfileDimensionProperty)

      /**
       * @param province The province belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a521e144dea58ee19ba722692305902796fc0d0e4cad04585e921a151c9fc3")
      public fun province(province: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param state The state belonging to the address.
       */
      public fun state(state: IResolvable)

      /**
       * @param state The state belonging to the address.
       */
      public fun state(state: ProfileDimensionProperty)

      /**
       * @param state The state belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62b8d98559a49abb36cdc31ad2ea725dd182239b8b5ac48794943e2714de1fb2")
      public fun state(state: ProfileDimensionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty.builder()

      /**
       * @param city The city belonging to the address.
       */
      override fun city(city: IResolvable) {
        cdkBuilder.city(city.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param city The city belonging to the address.
       */
      override fun city(city: ProfileDimensionProperty) {
        cdkBuilder.city(city.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param city The city belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffed14b57cc64205d8dbd2d312feb0523727b5d6b3a03e5345a0153dd0649e7a")
      override fun city(city: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          city(ProfileDimensionProperty(city))

      /**
       * @param country The country belonging to the address.
       */
      override fun country(country: IResolvable) {
        cdkBuilder.country(country.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param country The country belonging to the address.
       */
      override fun country(country: ProfileDimensionProperty) {
        cdkBuilder.country(country.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param country The country belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8b0efb608406083ceb560c8086558342b475f233853b12339e199ee3699634")
      override fun country(country: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          country(ProfileDimensionProperty(country))

      /**
       * @param county The county belonging to the address.
       */
      override fun county(county: IResolvable) {
        cdkBuilder.county(county.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param county The county belonging to the address.
       */
      override fun county(county: ProfileDimensionProperty) {
        cdkBuilder.county(county.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param county The county belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905d89eac611c4af713298b0b1b1ef9549916203edb931af854408b7d0a95784")
      override fun county(county: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          county(ProfileDimensionProperty(county))

      /**
       * @param postalCode The postal code belonging to the address.
       */
      override fun postalCode(postalCode: IResolvable) {
        cdkBuilder.postalCode(postalCode.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postalCode The postal code belonging to the address.
       */
      override fun postalCode(postalCode: ProfileDimensionProperty) {
        cdkBuilder.postalCode(postalCode.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param postalCode The postal code belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbd1e7335883c6724ca5987de6067a44c5fd941db4fb01169c979e46df641b4c")
      override fun postalCode(postalCode: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          postalCode(ProfileDimensionProperty(postalCode))

      /**
       * @param province The province belonging to the address.
       */
      override fun province(province: IResolvable) {
        cdkBuilder.province(province.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param province The province belonging to the address.
       */
      override fun province(province: ProfileDimensionProperty) {
        cdkBuilder.province(province.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param province The province belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7a521e144dea58ee19ba722692305902796fc0d0e4cad04585e921a151c9fc3")
      override fun province(province: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          province(ProfileDimensionProperty(province))

      /**
       * @param state The state belonging to the address.
       */
      override fun state(state: IResolvable) {
        cdkBuilder.state(state.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param state The state belonging to the address.
       */
      override fun state(state: ProfileDimensionProperty) {
        cdkBuilder.state(state.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param state The state belonging to the address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62b8d98559a49abb36cdc31ad2ea725dd182239b8b5ac48794943e2714de1fb2")
      override fun state(state: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          state(ProfileDimensionProperty(state))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty,
    ) : CdkObject(cdkObject),
        AddressDimensionProperty {
      /**
       * The city belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-city)
       */
      override fun city(): Any? = unwrap(this).getCity()

      /**
       * The country belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-country)
       */
      override fun country(): Any? = unwrap(this).getCountry()

      /**
       * The county belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-county)
       */
      override fun county(): Any? = unwrap(this).getCounty()

      /**
       * The postal code belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-postalcode)
       */
      override fun postalCode(): Any? = unwrap(this).getPostalCode()

      /**
       * The province belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-province)
       */
      override fun province(): Any? = unwrap(this).getProvince()

      /**
       * The state belonging to the address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-addressdimension.html#cfn-customerprofiles-segmentdefinition-addressdimension-state)
       */
      override fun state(): Any? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddressDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty):
          AddressDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? AddressDimensionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddressDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AddressDimensionProperty
    }
  }

  /**
   * Object that defines how to filter the incoming objects for the calculated attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-attributedimension.html)
   */
  public interface AttributeDimensionProperty {
    /**
     * The action to segment with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-attributedimension.html#cfn-customerprofiles-segmentdefinition-attributedimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * The values to apply the DimensionType on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-attributedimension.html#cfn-customerprofiles-segmentdefinition-attributedimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [AttributeDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The action to segment with. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty.builder()

      /**
       * @param dimensionType The action to segment with. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty,
    ) : CdkObject(cdkObject),
        AttributeDimensionProperty {
      /**
       * The action to segment with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-attributedimension.html#cfn-customerprofiles-segmentdefinition-attributedimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * The values to apply the DimensionType on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-attributedimension.html#cfn-customerprofiles-segmentdefinition-attributedimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty):
          AttributeDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttributeDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.AttributeDimensionProperty
    }
  }

  /**
   * Object that segments on Customer Profile's Calculated Attributes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * CalculatedAttributeDimensionProperty calculatedAttributeDimensionProperty =
   * CalculatedAttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * // the properties below are optional
   * .conditionOverrides(ConditionOverridesProperty.builder()
   * .range(RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html)
   */
  public interface CalculatedAttributeDimensionProperty {
    /**
     * Applies the given condition over the initial Calculated Attribute's definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-conditionoverrides)
     */
    public fun conditionOverrides(): Any? = unwrap(this).getConditionOverrides()

    /**
     * The action to segment with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * The values to apply the DimensionType with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [CalculatedAttributeDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      public fun conditionOverrides(conditionOverrides: IResolvable)

      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      public fun conditionOverrides(conditionOverrides: ConditionOverridesProperty)

      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397976618976856d91a2ab999f1ec68b7c5901ff92068f329a6d875bb47ede30")
      public
          fun conditionOverrides(conditionOverrides: ConditionOverridesProperty.Builder.() -> Unit)

      /**
       * @param dimensionType The action to segment with. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The values to apply the DimensionType with. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to apply the DimensionType with. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty.builder()

      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      override fun conditionOverrides(conditionOverrides: IResolvable) {
        cdkBuilder.conditionOverrides(conditionOverrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      override fun conditionOverrides(conditionOverrides: ConditionOverridesProperty) {
        cdkBuilder.conditionOverrides(conditionOverrides.let(ConditionOverridesProperty.Companion::unwrap))
      }

      /**
       * @param conditionOverrides Applies the given condition over the initial Calculated
       * Attribute's definition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397976618976856d91a2ab999f1ec68b7c5901ff92068f329a6d875bb47ede30")
      override
          fun conditionOverrides(conditionOverrides: ConditionOverridesProperty.Builder.() -> Unit):
          Unit = conditionOverrides(ConditionOverridesProperty(conditionOverrides))

      /**
       * @param dimensionType The action to segment with. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The values to apply the DimensionType with. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to apply the DimensionType with. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty,
    ) : CdkObject(cdkObject),
        CalculatedAttributeDimensionProperty {
      /**
       * Applies the given condition over the initial Calculated Attribute's definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-conditionoverrides)
       */
      override fun conditionOverrides(): Any? = unwrap(this).getConditionOverrides()

      /**
       * The action to segment with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * The values to apply the DimensionType with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-calculatedattributedimension.html#cfn-customerprofiles-segmentdefinition-calculatedattributedimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CalculatedAttributeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty):
          CalculatedAttributeDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CalculatedAttributeDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CalculatedAttributeDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.CalculatedAttributeDimensionProperty
    }
  }

  /**
   * An object to override the original condition block of a calculated attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ConditionOverridesProperty conditionOverridesProperty = ConditionOverridesProperty.builder()
   * .range(RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-conditionoverrides.html)
   */
  public interface ConditionOverridesProperty {
    /**
     * The relative time period over which data is included in the aggregation for this override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-conditionoverrides.html#cfn-customerprofiles-segmentdefinition-conditionoverrides-range)
     */
    public fun range(): Any? = unwrap(this).getRange()

    /**
     * A builder for [ConditionOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      public fun range(range: IResolvable)

      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      public fun range(range: RangeOverrideProperty)

      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("864e3357b11bddd4fae52c06a45049434304478ca259dc3904a998771130ecad")
      public fun range(range: RangeOverrideProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty.builder()

      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      override fun range(range: RangeOverrideProperty) {
        cdkBuilder.range(range.let(RangeOverrideProperty.Companion::unwrap))
      }

      /**
       * @param range The relative time period over which data is included in the aggregation for
       * this override.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("864e3357b11bddd4fae52c06a45049434304478ca259dc3904a998771130ecad")
      override fun range(range: RangeOverrideProperty.Builder.() -> Unit): Unit =
          range(RangeOverrideProperty(range))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty,
    ) : CdkObject(cdkObject),
        ConditionOverridesProperty {
      /**
       * The relative time period over which data is included in the aggregation for this override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-conditionoverrides.html#cfn-customerprofiles-segmentdefinition-conditionoverrides-range)
       */
      override fun range(): Any? = unwrap(this).getRange()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty):
          ConditionOverridesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionOverridesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionOverridesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ConditionOverridesProperty
    }
  }

  /**
   * Object that segments on various Customer Profile's date fields.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * DateDimensionProperty dateDimensionProperty = DateDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-datedimension.html)
   */
  public interface DateDimensionProperty {
    /**
     * The action to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-datedimension.html#cfn-customerprofiles-segmentdefinition-datedimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * The values to apply the DimensionType on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-datedimension.html#cfn-customerprofiles-segmentdefinition-datedimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [DateDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The action to segment on. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty.builder()

      /**
       * @param dimensionType The action to segment on. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty,
    ) : CdkObject(cdkObject),
        DateDimensionProperty {
      /**
       * The action to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-datedimension.html#cfn-customerprofiles-segmentdefinition-datedimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * The values to apply the DimensionType on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-datedimension.html#cfn-customerprofiles-segmentdefinition-datedimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty):
          DateDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? DateDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DateDimensionProperty
    }
  }

  /**
   * Defines the attribute to segment on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * DimensionProperty dimensionProperty = DimensionProperty.builder()
   * .calculatedAttributes(Map.of(
   * "calculatedAttributesKey", CalculatedAttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * // the properties below are optional
   * .conditionOverrides(ConditionOverridesProperty.builder()
   * .range(RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build())
   * .build())
   * .build()))
   * .profileAttributes(ProfileAttributesProperty.builder()
   * .accountNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .additionalInformation(ExtraLengthValueProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .address(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .attributes(Map.of(
   * "attributesKey", AttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build()))
   * .billingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .birthDate(DateDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessPhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .emailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .firstName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .genderString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .homePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .lastName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mailingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .middleName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mobilePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .partyTypeString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .personalEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .phoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .profileType(ProfileTypeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .shippingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-dimension.html)
   */
  public interface DimensionProperty {
    /**
     * Object that holds the calculated attributes to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-dimension.html#cfn-customerprofiles-segmentdefinition-dimension-calculatedattributes)
     */
    public fun calculatedAttributes(): Any? = unwrap(this).getCalculatedAttributes()

    /**
     * Object that holds the profile attributes to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-dimension.html#cfn-customerprofiles-segmentdefinition-dimension-profileattributes)
     */
    public fun profileAttributes(): Any? = unwrap(this).getProfileAttributes()

    /**
     * A builder for [DimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param calculatedAttributes Object that holds the calculated attributes to segment on.
       */
      public fun calculatedAttributes(calculatedAttributes: IResolvable)

      /**
       * @param calculatedAttributes Object that holds the calculated attributes to segment on.
       */
      public fun calculatedAttributes(calculatedAttributes: Map<String, Any>)

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      public fun profileAttributes(profileAttributes: IResolvable)

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      public fun profileAttributes(profileAttributes: ProfileAttributesProperty)

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("593760b2b2e19ba221dce6baa3a5a3556c6b8d1b3a6ca01e01df3c9e9c38c3dd")
      public fun profileAttributes(profileAttributes: ProfileAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty.builder()

      /**
       * @param calculatedAttributes Object that holds the calculated attributes to segment on.
       */
      override fun calculatedAttributes(calculatedAttributes: IResolvable) {
        cdkBuilder.calculatedAttributes(calculatedAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param calculatedAttributes Object that holds the calculated attributes to segment on.
       */
      override fun calculatedAttributes(calculatedAttributes: Map<String, Any>) {
        cdkBuilder.calculatedAttributes(calculatedAttributes.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      override fun profileAttributes(profileAttributes: IResolvable) {
        cdkBuilder.profileAttributes(profileAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      override fun profileAttributes(profileAttributes: ProfileAttributesProperty) {
        cdkBuilder.profileAttributes(profileAttributes.let(ProfileAttributesProperty.Companion::unwrap))
      }

      /**
       * @param profileAttributes Object that holds the profile attributes to segment on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("593760b2b2e19ba221dce6baa3a5a3556c6b8d1b3a6ca01e01df3c9e9c38c3dd")
      override
          fun profileAttributes(profileAttributes: ProfileAttributesProperty.Builder.() -> Unit):
          Unit = profileAttributes(ProfileAttributesProperty(profileAttributes))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty,
    ) : CdkObject(cdkObject),
        DimensionProperty {
      /**
       * Object that holds the calculated attributes to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-dimension.html#cfn-customerprofiles-segmentdefinition-dimension-calculatedattributes)
       */
      override fun calculatedAttributes(): Any? = unwrap(this).getCalculatedAttributes()

      /**
       * Object that holds the profile attributes to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-dimension.html#cfn-customerprofiles-segmentdefinition-dimension-profileattributes)
       */
      override fun profileAttributes(): Any? = unwrap(this).getProfileAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty):
          DimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? DimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.DimensionProperty
    }
  }

  /**
   * Object that segments on various Customer profile's fields that are larger than normal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ExtraLengthValueProfileDimensionProperty extraLengthValueProfileDimensionProperty =
   * ExtraLengthValueProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-extralengthvalueprofiledimension.html)
   */
  public interface ExtraLengthValueProfileDimensionProperty {
    /**
     * The action to segment with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-extralengthvalueprofiledimension.html#cfn-customerprofiles-segmentdefinition-extralengthvalueprofiledimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * The values to apply the DimensionType on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-extralengthvalueprofiledimension.html#cfn-customerprofiles-segmentdefinition-extralengthvalueprofiledimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [ExtraLengthValueProfileDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The action to segment with. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty.builder()

      /**
       * @param dimensionType The action to segment with. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty,
    ) : CdkObject(cdkObject),
        ExtraLengthValueProfileDimensionProperty {
      /**
       * The action to segment with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-extralengthvalueprofiledimension.html#cfn-customerprofiles-segmentdefinition-extralengthvalueprofiledimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * The values to apply the DimensionType on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-extralengthvalueprofiledimension.html#cfn-customerprofiles-segmentdefinition-extralengthvalueprofiledimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExtraLengthValueProfileDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty):
          ExtraLengthValueProfileDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExtraLengthValueProfileDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtraLengthValueProfileDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ExtraLengthValueProfileDimensionProperty
    }
  }

  /**
   * Contains dimensions that determine what to segment on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * GroupProperty groupProperty = GroupProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .calculatedAttributes(Map.of(
   * "calculatedAttributesKey", CalculatedAttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * // the properties below are optional
   * .conditionOverrides(ConditionOverridesProperty.builder()
   * .range(RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build())
   * .build())
   * .build()))
   * .profileAttributes(ProfileAttributesProperty.builder()
   * .accountNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .additionalInformation(ExtraLengthValueProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .address(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .attributes(Map.of(
   * "attributesKey", AttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build()))
   * .billingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .birthDate(DateDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessPhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .emailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .firstName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .genderString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .homePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .lastName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mailingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .middleName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mobilePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .partyTypeString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .personalEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .phoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .profileType(ProfileTypeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .shippingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .sourceSegments(List.of(SourceSegmentProperty.builder()
   * .segmentDefinitionName("segmentDefinitionName")
   * .build()))
   * .sourceType("sourceType")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html)
   */
  public interface GroupProperty {
    /**
     * Defines the attributes to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * Defines the starting source of data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-sourcesegments)
     */
    public fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

    /**
     * Defines how to interact with the source data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-sourcetype)
     */
    public fun sourceType(): String? = unwrap(this).getSourceType()

    /**
     * Defines how to interact with the profiles found in the current filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [GroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions Defines the attributes to segment on.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions Defines the attributes to segment on.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions Defines the attributes to segment on.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      public fun sourceSegments(sourceSegments: IResolvable)

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      public fun sourceSegments(sourceSegments: List<Any>)

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      public fun sourceSegments(vararg sourceSegments: Any)

      /**
       * @param sourceType Defines how to interact with the source data.
       */
      public fun sourceType(sourceType: String)

      /**
       * @param type Defines how to interact with the profiles found in the current filtering.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty.builder()

      /**
       * @param dimensions Defines the attributes to segment on.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensions Defines the attributes to segment on.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensions Defines the attributes to segment on.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      override fun sourceSegments(sourceSegments: IResolvable) {
        cdkBuilder.sourceSegments(sourceSegments.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      override fun sourceSegments(sourceSegments: List<Any>) {
        cdkBuilder.sourceSegments(sourceSegments.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourceSegments Defines the starting source of data.
       */
      override fun sourceSegments(vararg sourceSegments: Any): Unit =
          sourceSegments(sourceSegments.toList())

      /**
       * @param sourceType Defines how to interact with the source data.
       */
      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      /**
       * @param type Defines how to interact with the profiles found in the current filtering.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty,
    ) : CdkObject(cdkObject),
        GroupProperty {
      /**
       * Defines the attributes to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * Defines the starting source of data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-sourcesegments)
       */
      override fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

      /**
       * Defines how to interact with the source data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-sourcetype)
       */
      override fun sourceType(): String? = unwrap(this).getSourceType()

      /**
       * Defines how to interact with the profiles found in the current filtering.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-group.html#cfn-customerprofiles-segmentdefinition-group-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty):
          GroupProperty = CdkObjectWrappers.wrap(cdkObject) as? GroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.GroupProperty
    }
  }

  /**
   * The object used to segment on attributes within the customer profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ProfileAttributesProperty profileAttributesProperty = ProfileAttributesProperty.builder()
   * .accountNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .additionalInformation(ExtraLengthValueProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .address(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .attributes(Map.of(
   * "attributesKey", AttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build()))
   * .billingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .birthDate(DateDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessPhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .emailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .firstName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .genderString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .homePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .lastName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mailingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .middleName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mobilePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .partyTypeString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .personalEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .phoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .profileType(ProfileTypeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .shippingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html)
   */
  public interface ProfileAttributesProperty {
    /**
     * A field to describe values to segment on within account number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-accountnumber)
     */
    public fun accountNumber(): Any? = unwrap(this).getAccountNumber()

    /**
     * A field to describe values to segment on within additional information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-additionalinformation)
     */
    public fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

    /**
     * A field to describe values to segment on within address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-address)
     */
    public fun address(): Any? = unwrap(this).getAddress()

    /**
     * A field to describe values to segment on within attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A field to describe values to segment on within billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-billingaddress)
     */
    public fun billingAddress(): Any? = unwrap(this).getBillingAddress()

    /**
     * A field to describe values to segment on within birthDate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-birthdate)
     */
    public fun birthDate(): Any? = unwrap(this).getBirthDate()

    /**
     * A field to describe values to segment on within business email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessemailaddress)
     */
    public fun businessEmailAddress(): Any? = unwrap(this).getBusinessEmailAddress()

    /**
     * A field to describe values to segment on within business name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessname)
     */
    public fun businessName(): Any? = unwrap(this).getBusinessName()

    /**
     * A field to describe values to segment on within business phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessphonenumber)
     */
    public fun businessPhoneNumber(): Any? = unwrap(this).getBusinessPhoneNumber()

    /**
     * A field to describe values to segment on within email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-emailaddress)
     */
    public fun emailAddress(): Any? = unwrap(this).getEmailAddress()

    /**
     * A field to describe values to segment on within first name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-firstname)
     */
    public fun firstName(): Any? = unwrap(this).getFirstName()

    /**
     * A field to describe values to segment on within genderString.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-genderstring)
     */
    public fun genderString(): Any? = unwrap(this).getGenderString()

    /**
     * A field to describe values to segment on within home phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-homephonenumber)
     */
    public fun homePhoneNumber(): Any? = unwrap(this).getHomePhoneNumber()

    /**
     * A field to describe values to segment on within last name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-lastname)
     */
    public fun lastName(): Any? = unwrap(this).getLastName()

    /**
     * A field to describe values to segment on within mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-mailingaddress)
     */
    public fun mailingAddress(): Any? = unwrap(this).getMailingAddress()

    /**
     * A field to describe values to segment on within middle name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-middlename)
     */
    public fun middleName(): Any? = unwrap(this).getMiddleName()

    /**
     * A field to describe values to segment on within mobile phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-mobilephonenumber)
     */
    public fun mobilePhoneNumber(): Any? = unwrap(this).getMobilePhoneNumber()

    /**
     * A field to describe values to segment on within partyTypeString.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-partytypestring)
     */
    public fun partyTypeString(): Any? = unwrap(this).getPartyTypeString()

    /**
     * A field to describe values to segment on within personal email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-personalemailaddress)
     */
    public fun personalEmailAddress(): Any? = unwrap(this).getPersonalEmailAddress()

    /**
     * A field to describe values to segment on within phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-phonenumber)
     */
    public fun phoneNumber(): Any? = unwrap(this).getPhoneNumber()

    /**
     * The type of profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-profiletype)
     */
    public fun profileType(): Any? = unwrap(this).getProfileType()

    /**
     * A field to describe values to segment on within shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-shippingaddress)
     */
    public fun shippingAddress(): Any? = unwrap(this).getShippingAddress()

    /**
     * A builder for [ProfileAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      public fun accountNumber(accountNumber: IResolvable)

      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      public fun accountNumber(accountNumber: ProfileDimensionProperty)

      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b42480ceead5b4f4407afd38bae789c4d2f33dc7f033a63266528fcb12ed6948")
      public fun accountNumber(accountNumber: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      public fun additionalInformation(additionalInformation: IResolvable)

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      public
          fun additionalInformation(additionalInformation: ExtraLengthValueProfileDimensionProperty)

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae4bd7f9b72abc6805db8acff4209ba2267eb2864308466500f119629366080")
      public
          fun additionalInformation(additionalInformation: ExtraLengthValueProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param address A field to describe values to segment on within address.
       */
      public fun address(address: IResolvable)

      /**
       * @param address A field to describe values to segment on within address.
       */
      public fun address(address: AddressDimensionProperty)

      /**
       * @param address A field to describe values to segment on within address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4a211be81dc2d9f1755c816d57c0f363cd78c360c0faa4a8420bca4725a65")
      public fun address(address: AddressDimensionProperty.Builder.() -> Unit)

      /**
       * @param attributes A field to describe values to segment on within attributes.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes A field to describe values to segment on within attributes.
       */
      public fun attributes(attributes: Map<String, Any>)

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      public fun billingAddress(billingAddress: IResolvable)

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      public fun billingAddress(billingAddress: AddressDimensionProperty)

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b22a7bbdf985b19819eddebe14c1f8d095c019c7637beb07c0d723f0afa97928")
      public fun billingAddress(billingAddress: AddressDimensionProperty.Builder.() -> Unit)

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      public fun birthDate(birthDate: IResolvable)

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      public fun birthDate(birthDate: DateDimensionProperty)

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1cb716c3eb1b63daa2ec9cba390d26820fcad0c28d1cff6b55bd0bc06407f3f")
      public fun birthDate(birthDate: DateDimensionProperty.Builder.() -> Unit)

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      public fun businessEmailAddress(businessEmailAddress: IResolvable)

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      public fun businessEmailAddress(businessEmailAddress: ProfileDimensionProperty)

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad4d9ee1c39dc2829ac0b0ab6b52b608cbc511548b86a8b023071fc5312763d2")
      public
          fun businessEmailAddress(businessEmailAddress: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      public fun businessName(businessName: IResolvable)

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      public fun businessName(businessName: ProfileDimensionProperty)

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("253d042d5604f58035203f6c8acdf276f77df1b15ac023fcc781162df367efdf")
      public fun businessName(businessName: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      public fun businessPhoneNumber(businessPhoneNumber: IResolvable)

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      public fun businessPhoneNumber(businessPhoneNumber: ProfileDimensionProperty)

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e55d4aa2896ab6e04a5f8809bedc2b20073e7e7f61fa427057996d0e4ecef60")
      public
          fun businessPhoneNumber(businessPhoneNumber: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      public fun emailAddress(emailAddress: IResolvable)

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      public fun emailAddress(emailAddress: ProfileDimensionProperty)

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269401e32ec6f33a7a1c51c324a3015115b3bd6bc40f1b15d2b6df6966df1aef")
      public fun emailAddress(emailAddress: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      public fun firstName(firstName: IResolvable)

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      public fun firstName(firstName: ProfileDimensionProperty)

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6edf665d1b1004012c17bc0bafb65e0bf7c4f9e11f24e56b348ff805f3ab1a90")
      public fun firstName(firstName: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      public fun genderString(genderString: IResolvable)

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      public fun genderString(genderString: ProfileDimensionProperty)

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c0272351d16ce6886809aa2c763e7ec0aff9d106078e85ffdf40571489830f")
      public fun genderString(genderString: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      public fun homePhoneNumber(homePhoneNumber: IResolvable)

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      public fun homePhoneNumber(homePhoneNumber: ProfileDimensionProperty)

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf7f9617bbd6a0d191f60751b39ec78b5b993cc02cd6583f65bd670f17d38f83")
      public fun homePhoneNumber(homePhoneNumber: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      public fun lastName(lastName: IResolvable)

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      public fun lastName(lastName: ProfileDimensionProperty)

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a2638da892edb27e7a29b71043d3c933121f500892b1a8b191cb746d7249a")
      public fun lastName(lastName: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      public fun mailingAddress(mailingAddress: IResolvable)

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      public fun mailingAddress(mailingAddress: AddressDimensionProperty)

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("badc3103d8eae0999ebc7a172a13dc0df2cf66ea90bbe51123048c56bf9c44b2")
      public fun mailingAddress(mailingAddress: AddressDimensionProperty.Builder.() -> Unit)

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      public fun middleName(middleName: IResolvable)

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      public fun middleName(middleName: ProfileDimensionProperty)

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93cf431041e8708c9973e9a4fd4d6db69f99535c7411ca5c7e8aefcafc787f20")
      public fun middleName(middleName: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      public fun mobilePhoneNumber(mobilePhoneNumber: IResolvable)

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      public fun mobilePhoneNumber(mobilePhoneNumber: ProfileDimensionProperty)

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc421242542d1550329f84e625846fa831afee7a19a013b5e0ec871784a929c5")
      public fun mobilePhoneNumber(mobilePhoneNumber: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      public fun partyTypeString(partyTypeString: IResolvable)

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      public fun partyTypeString(partyTypeString: ProfileDimensionProperty)

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41b8f7c117fc63d216989c8fe8bd2e044a301ebd1b05c2e2065543ec3bdaa247")
      public fun partyTypeString(partyTypeString: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      public fun personalEmailAddress(personalEmailAddress: IResolvable)

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      public fun personalEmailAddress(personalEmailAddress: ProfileDimensionProperty)

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b39c387c735df36c16f4abfd8d77ba13da33e099791819c73c63ad632b3f42c6")
      public
          fun personalEmailAddress(personalEmailAddress: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      public fun phoneNumber(phoneNumber: IResolvable)

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      public fun phoneNumber(phoneNumber: ProfileDimensionProperty)

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0db851745a1b3d3a7b7172123ab4cd0b375593a28d6215b0d0ff6db9addf9286")
      public fun phoneNumber(phoneNumber: ProfileDimensionProperty.Builder.() -> Unit)

      /**
       * @param profileType The type of profile.
       */
      public fun profileType(profileType: IResolvable)

      /**
       * @param profileType The type of profile.
       */
      public fun profileType(profileType: ProfileTypeDimensionProperty)

      /**
       * @param profileType The type of profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8193865f3a374b6859c647d0f719bafc76a7ce0fa5b6806801defc68f1f0e56d")
      public fun profileType(profileType: ProfileTypeDimensionProperty.Builder.() -> Unit)

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      public fun shippingAddress(shippingAddress: IResolvable)

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      public fun shippingAddress(shippingAddress: AddressDimensionProperty)

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766e1463351b6c6889ef23975eb6218a9cab15f9e6772aadfa4b3d2cde00ee0b")
      public fun shippingAddress(shippingAddress: AddressDimensionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty.builder()

      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      override fun accountNumber(accountNumber: IResolvable) {
        cdkBuilder.accountNumber(accountNumber.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      override fun accountNumber(accountNumber: ProfileDimensionProperty) {
        cdkBuilder.accountNumber(accountNumber.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param accountNumber A field to describe values to segment on within account number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b42480ceead5b4f4407afd38bae789c4d2f33dc7f033a63266528fcb12ed6948")
      override fun accountNumber(accountNumber: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          accountNumber(ProfileDimensionProperty(accountNumber))

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      override fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      override
          fun additionalInformation(additionalInformation: ExtraLengthValueProfileDimensionProperty) {
        cdkBuilder.additionalInformation(additionalInformation.let(ExtraLengthValueProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param additionalInformation A field to describe values to segment on within additional
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae4bd7f9b72abc6805db8acff4209ba2267eb2864308466500f119629366080")
      override
          fun additionalInformation(additionalInformation: ExtraLengthValueProfileDimensionProperty.Builder.() -> Unit):
          Unit =
          additionalInformation(ExtraLengthValueProfileDimensionProperty(additionalInformation))

      /**
       * @param address A field to describe values to segment on within address.
       */
      override fun address(address: IResolvable) {
        cdkBuilder.address(address.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param address A field to describe values to segment on within address.
       */
      override fun address(address: AddressDimensionProperty) {
        cdkBuilder.address(address.let(AddressDimensionProperty.Companion::unwrap))
      }

      /**
       * @param address A field to describe values to segment on within address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21a4a211be81dc2d9f1755c816d57c0f363cd78c360c0faa4a8420bca4725a65")
      override fun address(address: AddressDimensionProperty.Builder.() -> Unit): Unit =
          address(AddressDimensionProperty(address))

      /**
       * @param attributes A field to describe values to segment on within attributes.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes A field to describe values to segment on within attributes.
       */
      override fun attributes(attributes: Map<String, Any>) {
        cdkBuilder.attributes(attributes.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      override fun billingAddress(billingAddress: IResolvable) {
        cdkBuilder.billingAddress(billingAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      override fun billingAddress(billingAddress: AddressDimensionProperty) {
        cdkBuilder.billingAddress(billingAddress.let(AddressDimensionProperty.Companion::unwrap))
      }

      /**
       * @param billingAddress A field to describe values to segment on within billing address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b22a7bbdf985b19819eddebe14c1f8d095c019c7637beb07c0d723f0afa97928")
      override fun billingAddress(billingAddress: AddressDimensionProperty.Builder.() -> Unit): Unit
          = billingAddress(AddressDimensionProperty(billingAddress))

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      override fun birthDate(birthDate: IResolvable) {
        cdkBuilder.birthDate(birthDate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      override fun birthDate(birthDate: DateDimensionProperty) {
        cdkBuilder.birthDate(birthDate.let(DateDimensionProperty.Companion::unwrap))
      }

      /**
       * @param birthDate A field to describe values to segment on within birthDate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1cb716c3eb1b63daa2ec9cba390d26820fcad0c28d1cff6b55bd0bc06407f3f")
      override fun birthDate(birthDate: DateDimensionProperty.Builder.() -> Unit): Unit =
          birthDate(DateDimensionProperty(birthDate))

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      override fun businessEmailAddress(businessEmailAddress: IResolvable) {
        cdkBuilder.businessEmailAddress(businessEmailAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      override fun businessEmailAddress(businessEmailAddress: ProfileDimensionProperty) {
        cdkBuilder.businessEmailAddress(businessEmailAddress.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param businessEmailAddress A field to describe values to segment on within business email
       * address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad4d9ee1c39dc2829ac0b0ab6b52b608cbc511548b86a8b023071fc5312763d2")
      override
          fun businessEmailAddress(businessEmailAddress: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = businessEmailAddress(ProfileDimensionProperty(businessEmailAddress))

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      override fun businessName(businessName: IResolvable) {
        cdkBuilder.businessName(businessName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      override fun businessName(businessName: ProfileDimensionProperty) {
        cdkBuilder.businessName(businessName.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param businessName A field to describe values to segment on within business name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("253d042d5604f58035203f6c8acdf276f77df1b15ac023fcc781162df367efdf")
      override fun businessName(businessName: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          businessName(ProfileDimensionProperty(businessName))

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      override fun businessPhoneNumber(businessPhoneNumber: IResolvable) {
        cdkBuilder.businessPhoneNumber(businessPhoneNumber.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      override fun businessPhoneNumber(businessPhoneNumber: ProfileDimensionProperty) {
        cdkBuilder.businessPhoneNumber(businessPhoneNumber.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param businessPhoneNumber A field to describe values to segment on within business phone
       * number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e55d4aa2896ab6e04a5f8809bedc2b20073e7e7f61fa427057996d0e4ecef60")
      override
          fun businessPhoneNumber(businessPhoneNumber: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = businessPhoneNumber(ProfileDimensionProperty(businessPhoneNumber))

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      override fun emailAddress(emailAddress: IResolvable) {
        cdkBuilder.emailAddress(emailAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      override fun emailAddress(emailAddress: ProfileDimensionProperty) {
        cdkBuilder.emailAddress(emailAddress.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param emailAddress A field to describe values to segment on within email address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269401e32ec6f33a7a1c51c324a3015115b3bd6bc40f1b15d2b6df6966df1aef")
      override fun emailAddress(emailAddress: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          emailAddress(ProfileDimensionProperty(emailAddress))

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      override fun firstName(firstName: IResolvable) {
        cdkBuilder.firstName(firstName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      override fun firstName(firstName: ProfileDimensionProperty) {
        cdkBuilder.firstName(firstName.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param firstName A field to describe values to segment on within first name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6edf665d1b1004012c17bc0bafb65e0bf7c4f9e11f24e56b348ff805f3ab1a90")
      override fun firstName(firstName: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          firstName(ProfileDimensionProperty(firstName))

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      override fun genderString(genderString: IResolvable) {
        cdkBuilder.genderString(genderString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      override fun genderString(genderString: ProfileDimensionProperty) {
        cdkBuilder.genderString(genderString.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param genderString A field to describe values to segment on within genderString.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c0272351d16ce6886809aa2c763e7ec0aff9d106078e85ffdf40571489830f")
      override fun genderString(genderString: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          genderString(ProfileDimensionProperty(genderString))

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      override fun homePhoneNumber(homePhoneNumber: IResolvable) {
        cdkBuilder.homePhoneNumber(homePhoneNumber.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      override fun homePhoneNumber(homePhoneNumber: ProfileDimensionProperty) {
        cdkBuilder.homePhoneNumber(homePhoneNumber.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param homePhoneNumber A field to describe values to segment on within home phone number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf7f9617bbd6a0d191f60751b39ec78b5b993cc02cd6583f65bd670f17d38f83")
      override fun homePhoneNumber(homePhoneNumber: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = homePhoneNumber(ProfileDimensionProperty(homePhoneNumber))

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      override fun lastName(lastName: IResolvable) {
        cdkBuilder.lastName(lastName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      override fun lastName(lastName: ProfileDimensionProperty) {
        cdkBuilder.lastName(lastName.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param lastName A field to describe values to segment on within last name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a2638da892edb27e7a29b71043d3c933121f500892b1a8b191cb746d7249a")
      override fun lastName(lastName: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          lastName(ProfileDimensionProperty(lastName))

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      override fun mailingAddress(mailingAddress: IResolvable) {
        cdkBuilder.mailingAddress(mailingAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      override fun mailingAddress(mailingAddress: AddressDimensionProperty) {
        cdkBuilder.mailingAddress(mailingAddress.let(AddressDimensionProperty.Companion::unwrap))
      }

      /**
       * @param mailingAddress A field to describe values to segment on within mailing address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("badc3103d8eae0999ebc7a172a13dc0df2cf66ea90bbe51123048c56bf9c44b2")
      override fun mailingAddress(mailingAddress: AddressDimensionProperty.Builder.() -> Unit): Unit
          = mailingAddress(AddressDimensionProperty(mailingAddress))

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      override fun middleName(middleName: IResolvable) {
        cdkBuilder.middleName(middleName.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      override fun middleName(middleName: ProfileDimensionProperty) {
        cdkBuilder.middleName(middleName.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param middleName A field to describe values to segment on within middle name.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93cf431041e8708c9973e9a4fd4d6db69f99535c7411ca5c7e8aefcafc787f20")
      override fun middleName(middleName: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          middleName(ProfileDimensionProperty(middleName))

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      override fun mobilePhoneNumber(mobilePhoneNumber: IResolvable) {
        cdkBuilder.mobilePhoneNumber(mobilePhoneNumber.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      override fun mobilePhoneNumber(mobilePhoneNumber: ProfileDimensionProperty) {
        cdkBuilder.mobilePhoneNumber(mobilePhoneNumber.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param mobilePhoneNumber A field to describe values to segment on within mobile phone
       * number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc421242542d1550329f84e625846fa831afee7a19a013b5e0ec871784a929c5")
      override
          fun mobilePhoneNumber(mobilePhoneNumber: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = mobilePhoneNumber(ProfileDimensionProperty(mobilePhoneNumber))

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      override fun partyTypeString(partyTypeString: IResolvable) {
        cdkBuilder.partyTypeString(partyTypeString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      override fun partyTypeString(partyTypeString: ProfileDimensionProperty) {
        cdkBuilder.partyTypeString(partyTypeString.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param partyTypeString A field to describe values to segment on within partyTypeString.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41b8f7c117fc63d216989c8fe8bd2e044a301ebd1b05c2e2065543ec3bdaa247")
      override fun partyTypeString(partyTypeString: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = partyTypeString(ProfileDimensionProperty(partyTypeString))

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      override fun personalEmailAddress(personalEmailAddress: IResolvable) {
        cdkBuilder.personalEmailAddress(personalEmailAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      override fun personalEmailAddress(personalEmailAddress: ProfileDimensionProperty) {
        cdkBuilder.personalEmailAddress(personalEmailAddress.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param personalEmailAddress A field to describe values to segment on within personal email
       * address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b39c387c735df36c16f4abfd8d77ba13da33e099791819c73c63ad632b3f42c6")
      override
          fun personalEmailAddress(personalEmailAddress: ProfileDimensionProperty.Builder.() -> Unit):
          Unit = personalEmailAddress(ProfileDimensionProperty(personalEmailAddress))

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      override fun phoneNumber(phoneNumber: IResolvable) {
        cdkBuilder.phoneNumber(phoneNumber.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      override fun phoneNumber(phoneNumber: ProfileDimensionProperty) {
        cdkBuilder.phoneNumber(phoneNumber.let(ProfileDimensionProperty.Companion::unwrap))
      }

      /**
       * @param phoneNumber A field to describe values to segment on within phone number.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0db851745a1b3d3a7b7172123ab4cd0b375593a28d6215b0d0ff6db9addf9286")
      override fun phoneNumber(phoneNumber: ProfileDimensionProperty.Builder.() -> Unit): Unit =
          phoneNumber(ProfileDimensionProperty(phoneNumber))

      /**
       * @param profileType The type of profile.
       */
      override fun profileType(profileType: IResolvable) {
        cdkBuilder.profileType(profileType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param profileType The type of profile.
       */
      override fun profileType(profileType: ProfileTypeDimensionProperty) {
        cdkBuilder.profileType(profileType.let(ProfileTypeDimensionProperty.Companion::unwrap))
      }

      /**
       * @param profileType The type of profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8193865f3a374b6859c647d0f719bafc76a7ce0fa5b6806801defc68f1f0e56d")
      override fun profileType(profileType: ProfileTypeDimensionProperty.Builder.() -> Unit): Unit =
          profileType(ProfileTypeDimensionProperty(profileType))

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      override fun shippingAddress(shippingAddress: IResolvable) {
        cdkBuilder.shippingAddress(shippingAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      override fun shippingAddress(shippingAddress: AddressDimensionProperty) {
        cdkBuilder.shippingAddress(shippingAddress.let(AddressDimensionProperty.Companion::unwrap))
      }

      /**
       * @param shippingAddress A field to describe values to segment on within shipping address.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766e1463351b6c6889ef23975eb6218a9cab15f9e6772aadfa4b3d2cde00ee0b")
      override fun shippingAddress(shippingAddress: AddressDimensionProperty.Builder.() -> Unit):
          Unit = shippingAddress(AddressDimensionProperty(shippingAddress))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty,
    ) : CdkObject(cdkObject),
        ProfileAttributesProperty {
      /**
       * A field to describe values to segment on within account number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-accountnumber)
       */
      override fun accountNumber(): Any? = unwrap(this).getAccountNumber()

      /**
       * A field to describe values to segment on within additional information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-additionalinformation)
       */
      override fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

      /**
       * A field to describe values to segment on within address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-address)
       */
      override fun address(): Any? = unwrap(this).getAddress()

      /**
       * A field to describe values to segment on within attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * A field to describe values to segment on within billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-billingaddress)
       */
      override fun billingAddress(): Any? = unwrap(this).getBillingAddress()

      /**
       * A field to describe values to segment on within birthDate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-birthdate)
       */
      override fun birthDate(): Any? = unwrap(this).getBirthDate()

      /**
       * A field to describe values to segment on within business email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessemailaddress)
       */
      override fun businessEmailAddress(): Any? = unwrap(this).getBusinessEmailAddress()

      /**
       * A field to describe values to segment on within business name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessname)
       */
      override fun businessName(): Any? = unwrap(this).getBusinessName()

      /**
       * A field to describe values to segment on within business phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-businessphonenumber)
       */
      override fun businessPhoneNumber(): Any? = unwrap(this).getBusinessPhoneNumber()

      /**
       * A field to describe values to segment on within email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-emailaddress)
       */
      override fun emailAddress(): Any? = unwrap(this).getEmailAddress()

      /**
       * A field to describe values to segment on within first name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-firstname)
       */
      override fun firstName(): Any? = unwrap(this).getFirstName()

      /**
       * A field to describe values to segment on within genderString.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-genderstring)
       */
      override fun genderString(): Any? = unwrap(this).getGenderString()

      /**
       * A field to describe values to segment on within home phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-homephonenumber)
       */
      override fun homePhoneNumber(): Any? = unwrap(this).getHomePhoneNumber()

      /**
       * A field to describe values to segment on within last name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-lastname)
       */
      override fun lastName(): Any? = unwrap(this).getLastName()

      /**
       * A field to describe values to segment on within mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-mailingaddress)
       */
      override fun mailingAddress(): Any? = unwrap(this).getMailingAddress()

      /**
       * A field to describe values to segment on within middle name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-middlename)
       */
      override fun middleName(): Any? = unwrap(this).getMiddleName()

      /**
       * A field to describe values to segment on within mobile phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-mobilephonenumber)
       */
      override fun mobilePhoneNumber(): Any? = unwrap(this).getMobilePhoneNumber()

      /**
       * A field to describe values to segment on within partyTypeString.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-partytypestring)
       */
      override fun partyTypeString(): Any? = unwrap(this).getPartyTypeString()

      /**
       * A field to describe values to segment on within personal email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-personalemailaddress)
       */
      override fun personalEmailAddress(): Any? = unwrap(this).getPersonalEmailAddress()

      /**
       * A field to describe values to segment on within phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-phonenumber)
       */
      override fun phoneNumber(): Any? = unwrap(this).getPhoneNumber()

      /**
       * The type of profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-profiletype)
       */
      override fun profileType(): Any? = unwrap(this).getProfileType()

      /**
       * A field to describe values to segment on within shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profileattributes.html#cfn-customerprofiles-segmentdefinition-profileattributes-shippingaddress)
       */
      override fun shippingAddress(): Any? = unwrap(this).getShippingAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty):
          ProfileAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProfileAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProfileAttributesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileAttributesProperty
    }
  }

  /**
   * Object that segments on various Customer profile's fields that are larger than normal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ProfileDimensionProperty profileDimensionProperty = ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiledimension.html)
   */
  public interface ProfileDimensionProperty {
    /**
     * The action to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiledimension.html#cfn-customerprofiles-segmentdefinition-profiledimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiledimension.html#cfn-customerprofiles-segmentdefinition-profiledimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [ProfileDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The action to segment on. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values the value to be set. 
       */
      public fun values(values: List<String>)

      /**
       * @param values the value to be set. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty.builder()

      /**
       * @param dimensionType The action to segment on. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values the value to be set. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values the value to be set. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty,
    ) : CdkObject(cdkObject),
        ProfileDimensionProperty {
      /**
       * The action to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiledimension.html#cfn-customerprofiles-segmentdefinition-profiledimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiledimension.html#cfn-customerprofiles-segmentdefinition-profiledimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty):
          ProfileDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? ProfileDimensionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProfileDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileDimensionProperty
    }
  }

  /**
   * Specifies profile type based criteria for a segment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ProfileTypeDimensionProperty profileTypeDimensionProperty =
   * ProfileTypeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiletypedimension.html)
   */
  public interface ProfileTypeDimensionProperty {
    /**
     * The action to segment on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiletypedimension.html#cfn-customerprofiles-segmentdefinition-profiletypedimension-dimensiontype)
     */
    public fun dimensionType(): String

    /**
     * The values to apply the DimensionType on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiletypedimension.html#cfn-customerprofiles-segmentdefinition-profiletypedimension-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [ProfileTypeDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionType The action to segment on. 
       */
      public fun dimensionType(dimensionType: String)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to apply the DimensionType on. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty.builder()

      /**
       * @param dimensionType The action to segment on. 
       */
      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to apply the DimensionType on. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty,
    ) : CdkObject(cdkObject),
        ProfileTypeDimensionProperty {
      /**
       * The action to segment on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiletypedimension.html#cfn-customerprofiles-segmentdefinition-profiletypedimension-dimensiontype)
       */
      override fun dimensionType(): String = unwrap(this).getDimensionType()

      /**
       * The values to apply the DimensionType on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-profiletypedimension.html#cfn-customerprofiles-segmentdefinition-profiletypedimension-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileTypeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty):
          ProfileTypeDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProfileTypeDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProfileTypeDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.ProfileTypeDimensionProperty
    }
  }

  /**
   * Overrides the original range on a calculated attribute definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * RangeOverrideProperty rangeOverrideProperty = RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html)
   */
  public interface RangeOverrideProperty {
    /**
     * The end time of when to include objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-end)
     */
    public fun end(): Number? = unwrap(this).getEnd()

    /**
     * The start time of when to include objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-start)
     */
    public fun start(): Number

    /**
     * The unit for start and end.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-unit)
     */
    public fun unit(): String

    /**
     * A builder for [RangeOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param end The end time of when to include objects.
       */
      public fun end(end: Number)

      /**
       * @param start The start time of when to include objects. 
       */
      public fun start(start: Number)

      /**
       * @param unit The unit for start and end. 
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty.builder()

      /**
       * @param end The end time of when to include objects.
       */
      override fun end(end: Number) {
        cdkBuilder.end(end)
      }

      /**
       * @param start The start time of when to include objects. 
       */
      override fun start(start: Number) {
        cdkBuilder.start(start)
      }

      /**
       * @param unit The unit for start and end. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty,
    ) : CdkObject(cdkObject),
        RangeOverrideProperty {
      /**
       * The end time of when to include objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-end)
       */
      override fun end(): Number? = unwrap(this).getEnd()

      /**
       * The start time of when to include objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-start)
       */
      override fun start(): Number = unwrap(this).getStart()

      /**
       * The unit for start and end.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-rangeoverride.html#cfn-customerprofiles-segmentdefinition-rangeoverride-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RangeOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty):
          RangeOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as? RangeOverrideProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeOverrideProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.RangeOverrideProperty
    }
  }

  /**
   * Contains all groups of the segment definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * SegmentGroupProperty segmentGroupProperty = SegmentGroupProperty.builder()
   * .groups(List.of(GroupProperty.builder()
   * .dimensions(List.of(DimensionProperty.builder()
   * .calculatedAttributes(Map.of(
   * "calculatedAttributesKey", CalculatedAttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * // the properties below are optional
   * .conditionOverrides(ConditionOverridesProperty.builder()
   * .range(RangeOverrideProperty.builder()
   * .start(123)
   * .unit("unit")
   * // the properties below are optional
   * .end(123)
   * .build())
   * .build())
   * .build()))
   * .profileAttributes(ProfileAttributesProperty.builder()
   * .accountNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .additionalInformation(ExtraLengthValueProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .address(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .attributes(Map.of(
   * "attributesKey", AttributeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build()))
   * .billingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .birthDate(DateDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .businessPhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .emailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .firstName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .genderString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .homePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .lastName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mailingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .middleName(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .mobilePhoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .partyTypeString(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .personalEmailAddress(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .phoneNumber(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .profileType(ProfileTypeDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .shippingAddress(AddressDimensionProperty.builder()
   * .city(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .country(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .county(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .postalCode(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .province(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .state(ProfileDimensionProperty.builder()
   * .dimensionType("dimensionType")
   * .values(List.of("values"))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .sourceSegments(List.of(SourceSegmentProperty.builder()
   * .segmentDefinitionName("segmentDefinitionName")
   * .build()))
   * .sourceType("sourceType")
   * .type("type")
   * .build()))
   * .include("include")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-segmentgroup.html)
   */
  public interface SegmentGroupProperty {
    /**
     * Holds the list of groups within the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-segmentgroup.html#cfn-customerprofiles-segmentdefinition-segmentgroup-groups)
     */
    public fun groups(): Any? = unwrap(this).getGroups()

    /**
     * Defines whether to include or exclude the profiles that fit the segment criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-segmentgroup.html#cfn-customerprofiles-segmentdefinition-segmentgroup-include)
     */
    public fun include(): String? = unwrap(this).getInclude()

    /**
     * A builder for [SegmentGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      public fun groups(groups: IResolvable)

      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      public fun groups(groups: List<Any>)

      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      public fun groups(vararg groups: Any)

      /**
       * @param include Defines whether to include or exclude the profiles that fit the segment
       * criteria.
       */
      public fun include(include: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty.builder()

      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      override fun groups(groups: IResolvable) {
        cdkBuilder.groups(groups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      override fun groups(groups: List<Any>) {
        cdkBuilder.groups(groups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param groups Holds the list of groups within the segment definition.
       */
      override fun groups(vararg groups: Any): Unit = groups(groups.toList())

      /**
       * @param include Defines whether to include or exclude the profiles that fit the segment
       * criteria.
       */
      override fun include(include: String) {
        cdkBuilder.include(include)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty,
    ) : CdkObject(cdkObject),
        SegmentGroupProperty {
      /**
       * Holds the list of groups within the segment definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-segmentgroup.html#cfn-customerprofiles-segmentdefinition-segmentgroup-groups)
       */
      override fun groups(): Any? = unwrap(this).getGroups()

      /**
       * Defines whether to include or exclude the profiles that fit the segment criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-segmentgroup.html#cfn-customerprofiles-segmentdefinition-segmentgroup-include)
       */
      override fun include(): String? = unwrap(this).getInclude()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty):
          SegmentGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? SegmentGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentGroupProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SegmentGroupProperty
    }
  }

  /**
   * The source segments to build off of.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * SourceSegmentProperty sourceSegmentProperty = SourceSegmentProperty.builder()
   * .segmentDefinitionName("segmentDefinitionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-sourcesegment.html)
   */
  public interface SourceSegmentProperty {
    /**
     * The name of the source segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-sourcesegment.html#cfn-customerprofiles-segmentdefinition-sourcesegment-segmentdefinitionname)
     */
    public fun segmentDefinitionName(): String? = unwrap(this).getSegmentDefinitionName()

    /**
     * A builder for [SourceSegmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param segmentDefinitionName The name of the source segment.
       */
      public fun segmentDefinitionName(segmentDefinitionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty.builder()

      /**
       * @param segmentDefinitionName The name of the source segment.
       */
      override fun segmentDefinitionName(segmentDefinitionName: String) {
        cdkBuilder.segmentDefinitionName(segmentDefinitionName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty,
    ) : CdkObject(cdkObject),
        SourceSegmentProperty {
      /**
       * The name of the source segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-segmentdefinition-sourcesegment.html#cfn-customerprofiles-segmentdefinition-sourcesegment-segmentdefinitionname)
       */
      override fun segmentDefinitionName(): String? = unwrap(this).getSegmentDefinitionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceSegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty):
          SourceSegmentProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceSegmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceSegmentProperty):
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition.SourceSegmentProperty
    }
  }
}

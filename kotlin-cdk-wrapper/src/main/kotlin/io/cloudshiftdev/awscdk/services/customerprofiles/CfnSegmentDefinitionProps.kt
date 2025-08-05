@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSegmentDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnSegmentDefinitionProps cfnSegmentDefinitionProps = CfnSegmentDefinitionProps.builder()
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
public interface CfnSegmentDefinitionProps {
  /**
   * The description of the segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Display name of the segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-displayname)
   */
  public fun displayName(): String

  /**
   * The name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-domainname)
   */
  public fun domainName(): String

  /**
   * Name of the segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentdefinitionname)
   */
  public fun segmentDefinitionName(): String

  /**
   * Contains all groups of the segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
   */
  public fun segmentGroups(): Any

  /**
   * The tags belonging to the segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSegmentDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the segment definition.
     */
    public fun description(description: String)

    /**
     * @param displayName Display name of the segment definition. 
     */
    public fun displayName(displayName: String)

    /**
     * @param domainName The name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param segmentDefinitionName Name of the segment definition. 
     */
    public fun segmentDefinitionName(segmentDefinitionName: String)

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    public fun segmentGroups(segmentGroups: IResolvable)

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    public fun segmentGroups(segmentGroups: CfnSegmentDefinition.SegmentGroupProperty)

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9da0c1ab95c6ca098542e935bdd353dace01d2ded724ab9f4f1fd03eccb5827d")
    public
        fun segmentGroups(segmentGroups: CfnSegmentDefinition.SegmentGroupProperty.Builder.() -> Unit)

    /**
     * @param tags The tags belonging to the segment definition.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags belonging to the segment definition.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps.builder()

    /**
     * @param description The description of the segment definition.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName Display name of the segment definition. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param domainName The name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param segmentDefinitionName Name of the segment definition. 
     */
    override fun segmentDefinitionName(segmentDefinitionName: String) {
      cdkBuilder.segmentDefinitionName(segmentDefinitionName)
    }

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    override fun segmentGroups(segmentGroups: IResolvable) {
      cdkBuilder.segmentGroups(segmentGroups.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    override fun segmentGroups(segmentGroups: CfnSegmentDefinition.SegmentGroupProperty) {
      cdkBuilder.segmentGroups(segmentGroups.let(CfnSegmentDefinition.SegmentGroupProperty.Companion::unwrap))
    }

    /**
     * @param segmentGroups Contains all groups of the segment definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9da0c1ab95c6ca098542e935bdd353dace01d2ded724ab9f4f1fd03eccb5827d")
    override
        fun segmentGroups(segmentGroups: CfnSegmentDefinition.SegmentGroupProperty.Builder.() -> Unit):
        Unit = segmentGroups(CfnSegmentDefinition.SegmentGroupProperty(segmentGroups))

    /**
     * @param tags The tags belonging to the segment definition.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags belonging to the segment definition.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnSegmentDefinitionProps {
    /**
     * The description of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Display name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Name of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentdefinitionname)
     */
    override fun segmentDefinitionName(): String = unwrap(this).getSegmentDefinitionName()

    /**
     * Contains all groups of the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-segmentgroups)
     */
    override fun segmentGroups(): Any = unwrap(this).getSegmentGroups()

    /**
     * The tags belonging to the segment definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-segmentdefinition.html#cfn-customerprofiles-segmentdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSegmentDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps):
        CfnSegmentDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSegmentDefinitionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSegmentDefinitionProps):
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCapacityReservation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnCapacityReservationProps cfnCapacityReservationProps = CfnCapacityReservationProps.builder()
 * .name("name")
 * .targetDpus(123)
 * // the properties below are optional
 * .capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty.builder()
 * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
 * .workgroupNames(List.of("workgroupNames"))
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html)
 */
public interface CfnCapacityReservationProps {
  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   *
   * A capacity reservation can have only one capacity assignment configuration, but the capacity
   * assignment configuration can be made up of multiple individual assignments. Each assignment
   * specifies how Athena queries can consume capacity from the capacity reservation that their
   * workgroup is mapped to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
   */
  public fun capacityAssignmentConfiguration(): Any? =
      unwrap(this).getCapacityAssignmentConfiguration()

  /**
   * The name of the capacity reservation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to the capacity reservation.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The number of data processing units requested.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-targetdpus)
   */
  public fun targetDpus(): Number

  /**
   * A builder for [CfnCapacityReservationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable)

    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty)

    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b979be9beaab427b42c10ad83a2bfdc39237adda5293638b6ccbc520411253")
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the capacity reservation. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetDpus The number of data processing units requested. 
     */
    public fun targetDpus(targetDpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps.Builder =
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps.builder()

    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    override fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(CfnCapacityReservation.CapacityAssignmentConfigurationProperty::unwrap))
    }

    /**
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations.
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b979be9beaab427b42c10ad83a2bfdc39237adda5293638b6ccbc520411253")
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        capacityAssignmentConfiguration(CfnCapacityReservation.CapacityAssignmentConfigurationProperty(capacityAssignmentConfiguration))

    /**
     * @param name The name of the capacity reservation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetDpus The number of data processing units requested. 
     */
    override fun targetDpus(targetDpus: Number) {
      cdkBuilder.targetDpus(targetDpus)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnCapacityReservationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservationProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationProps {
    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     */
    override fun capacityAssignmentConfiguration(): Any? =
        unwrap(this).getCapacityAssignmentConfiguration()

    /**
     * The name of the capacity reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The number of data processing units requested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-targetdpus)
     */
    override fun targetDpus(): Number = unwrap(this).getTargetDpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservationProps):
        CfnCapacityReservationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationProps):
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.athena.CfnCapacityReservationProps
  }
}

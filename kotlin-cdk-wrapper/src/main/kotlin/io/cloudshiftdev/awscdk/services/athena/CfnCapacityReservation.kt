@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a capacity reservation with the provided name and number of requested data processing
 * units.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnCapacityReservation cfnCapacityReservation = CfnCapacityReservation.Builder.create(this,
 * "MyCfnCapacityReservation")
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
public open class CfnCapacityReservation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The number of data processing units currently allocated.
   */
  public open fun attrAllocatedDpus(): Number = unwrap(this).getAttrAllocatedDpus()

  /**
   * The ARN of the capacity reservation.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time in UTC epoch millis when the capacity reservation was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time of the most recent capacity allocation that succeeded.
   */
  public open fun attrLastSuccessfulAllocationTime(): String =
      unwrap(this).getAttrLastSuccessfulAllocationTime()

  /**
   * The status of the capacity reservation.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   */
  public open fun capacityAssignmentConfiguration(): Any? =
      unwrap(this).getCapacityAssignmentConfiguration()

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   */
  public open fun capacityAssignmentConfiguration(`value`: IResolvable) {
    unwrap(this).setCapacityAssignmentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   */
  public open
      fun capacityAssignmentConfiguration(`value`: CapacityAssignmentConfigurationProperty) {
    unwrap(this).setCapacityAssignmentConfiguration(`value`.let(CapacityAssignmentConfigurationProperty::unwrap))
  }

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03f516509aa94e9d6b3e3a0ea77fd6105a0a9eec6522aec32c359d17f06d94ac")
  public open
      fun capacityAssignmentConfiguration(`value`: CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
      Unit = capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the capacity reservation.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the capacity reservation.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array of key-value pairs to apply to the capacity reservation.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to the capacity reservation.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the capacity reservation.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The number of data processing units requested.
   */
  public open fun targetDpus(): Number = unwrap(this).getTargetDpus()

  /**
   * The number of data processing units requested.
   */
  public open fun targetDpus(`value`: Number) {
    unwrap(this).setTargetDpus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.athena.CfnCapacityReservation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable)

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty)

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f001a886dd0a53d1116add225212dc5c6d24da356ab06da3e64adabe3878ae64")
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the capacity reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-name)
     * @param name The name of the capacity reservation. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     * @param tags An array of key-value pairs to apply to the capacity reservation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     * @param tags An array of key-value pairs to apply to the capacity reservation. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The number of data processing units requested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-targetdpus)
     * @param targetDpus The number of data processing units requested. 
     */
    public fun targetDpus(targetDpus: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnCapacityReservation.Builder =
        software.amazon.awscdk.services.athena.CfnCapacityReservation.Builder.create(scope, id)

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    override fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(CapacityAssignmentConfigurationProperty::unwrap))
    }

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     * capacity reservations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f001a886dd0a53d1116add225212dc5c6d24da356ab06da3e64adabe3878ae64")
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty(capacityAssignmentConfiguration))

    /**
     * The name of the capacity reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-name)
     * @param name The name of the capacity reservation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     * @param tags An array of key-value pairs to apply to the capacity reservation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     * @param tags An array of key-value pairs to apply to the capacity reservation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The number of data processing units requested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-targetdpus)
     * @param targetDpus The number of data processing units requested. 
     */
    override fun targetDpus(targetDpus: Number) {
      cdkBuilder.targetDpus(targetDpus)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnCapacityReservation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnCapacityReservation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation):
        CfnCapacityReservation = CfnCapacityReservation(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservation):
        software.amazon.awscdk.services.athena.CfnCapacityReservation = wrapped.cdkObject
  }

  /**
   * Assigns Athena workgroups (and hence their queries) to capacity reservations.
   *
   * A capacity reservation can have only one capacity assignment configuration, but the capacity
   * assignment configuration can be made up of multiple individual assignments. Each assignment
   * specifies how Athena queries can consume capacity from the capacity reservation that their
   * workgroup is mapped to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * CapacityAssignmentConfigurationProperty capacityAssignmentConfigurationProperty =
   * CapacityAssignmentConfigurationProperty.builder()
   * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignmentconfiguration.html)
   */
  public interface CapacityAssignmentConfigurationProperty {
    /**
     * The list of assignments that make up the capacity assignment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignmentconfiguration.html#cfn-athena-capacityreservation-capacityassignmentconfiguration-capacityassignments)
     */
    public fun capacityAssignments(): Any

    /**
     * A builder for [CapacityAssignmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      public fun capacityAssignments(capacityAssignments: IResolvable)

      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      public fun capacityAssignments(capacityAssignments: List<Any>)

      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      public fun capacityAssignments(vararg capacityAssignments: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty.builder()

      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      override fun capacityAssignments(capacityAssignments: IResolvable) {
        cdkBuilder.capacityAssignments(capacityAssignments.let(IResolvable::unwrap))
      }

      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      override fun capacityAssignments(capacityAssignments: List<Any>) {
        cdkBuilder.capacityAssignments(capacityAssignments)
      }

      /**
       * @param capacityAssignments The list of assignments that make up the capacity assignment
       * configuration. 
       */
      override fun capacityAssignments(vararg capacityAssignments: Any): Unit =
          capacityAssignments(capacityAssignments.toList())

      public fun build():
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty,
    ) : CdkObject(cdkObject), CapacityAssignmentConfigurationProperty {
      /**
       * The list of assignments that make up the capacity assignment configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignmentconfiguration.html#cfn-athena-capacityreservation-capacityassignmentconfiguration-capacityassignments)
       */
      override fun capacityAssignments(): Any = unwrap(this).getCapacityAssignments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityAssignmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty):
          CapacityAssignmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAssignmentConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
    }
  }

  /**
   * A mapping between one or more workgroups and a capacity reservation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * CapacityAssignmentProperty capacityAssignmentProperty = CapacityAssignmentProperty.builder()
   * .workgroupNames(List.of("workgroupNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignment.html)
   */
  public interface CapacityAssignmentProperty {
    /**
     * The list of workgroup names for the capacity assignment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignment.html#cfn-athena-capacityreservation-capacityassignment-workgroupnames)
     */
    public fun workgroupNames(): List<String>

    /**
     * A builder for [CapacityAssignmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workgroupNames The list of workgroup names for the capacity assignment. 
       */
      public fun workgroupNames(workgroupNames: List<String>)

      /**
       * @param workgroupNames The list of workgroup names for the capacity assignment. 
       */
      public fun workgroupNames(vararg workgroupNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty.builder()

      /**
       * @param workgroupNames The list of workgroup names for the capacity assignment. 
       */
      override fun workgroupNames(workgroupNames: List<String>) {
        cdkBuilder.workgroupNames(workgroupNames)
      }

      /**
       * @param workgroupNames The list of workgroup names for the capacity assignment. 
       */
      override fun workgroupNames(vararg workgroupNames: String): Unit =
          workgroupNames(workgroupNames.toList())

      public fun build():
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty,
    ) : CdkObject(cdkObject), CapacityAssignmentProperty {
      /**
       * The list of workgroup names for the capacity assignment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignment.html#cfn-athena-capacityreservation-capacityassignment-workgroupnames)
       */
      override fun workgroupNames(): List<String> = unwrap(this).getWorkgroupNames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityAssignmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty):
          CapacityAssignmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAssignmentProperty):
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty
    }
  }
}

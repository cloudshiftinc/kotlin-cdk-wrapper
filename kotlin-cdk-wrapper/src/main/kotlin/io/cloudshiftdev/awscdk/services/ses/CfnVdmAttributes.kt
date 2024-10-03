@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The Virtual Deliverability Manager (VDM) attributes that apply to your Amazon SES account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnVdmAttributes cfnVdmAttributes = CfnVdmAttributes.Builder.create(this, "MyCfnVdmAttributes")
 * .dashboardAttributes(DashboardAttributesProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build())
 * .guardianAttributes(GuardianAttributesProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html)
 */
public open class CfnVdmAttributes(
  cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnVdmAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVdmAttributesProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnVdmAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVdmAttributesProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVdmAttributesProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVdmAttributesProps(props)
  )

  /**
   * Unique identifier for this resource.
   */
  public open fun attrVdmAttributesResourceId(): String =
      unwrap(this).getAttrVdmAttributesResourceId()

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   */
  public open fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   */
  public open fun dashboardAttributes(`value`: IResolvable) {
    unwrap(this).setDashboardAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   */
  public open fun dashboardAttributes(`value`: DashboardAttributesProperty) {
    unwrap(this).setDashboardAttributes(`value`.let(DashboardAttributesProperty.Companion::unwrap))
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad86552c868f9434dcf67f82d4c394342c6c187f3e90f0c2c4e5001a1263c169")
  public open fun dashboardAttributes(`value`: DashboardAttributesProperty.Builder.() -> Unit): Unit
      = dashboardAttributes(DashboardAttributesProperty(`value`))

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   */
  public open fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   */
  public open fun guardianAttributes(`value`: IResolvable) {
    unwrap(this).setGuardianAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   */
  public open fun guardianAttributes(`value`: GuardianAttributesProperty) {
    unwrap(this).setGuardianAttributes(`value`.let(GuardianAttributesProperty.Companion::unwrap))
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c4ede8823d3956ded0c2cc82458ad4d55b0fb837bd6e6c9c0ad97c804ec28d2")
  public open fun guardianAttributes(`value`: GuardianAttributesProperty.Builder.() -> Unit): Unit =
      guardianAttributes(GuardianAttributesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnVdmAttributes].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    public fun dashboardAttributes(dashboardAttributes: IResolvable)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    public fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a692f1ea2143d633e81ff1451b925182bdddc1301c184b2a2a0c2d86ed08ff")
    public
        fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty.Builder.() -> Unit)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    public fun guardianAttributes(guardianAttributes: IResolvable)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    public fun guardianAttributes(guardianAttributes: GuardianAttributesProperty)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d456f0e3099a8dac0b7281769a5de33cc908e5afffc3f15fa111de935db37551")
    public fun guardianAttributes(guardianAttributes: GuardianAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnVdmAttributes.Builder =
        software.amazon.awscdk.services.ses.CfnVdmAttributes.Builder.create(scope, id)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    override fun dashboardAttributes(dashboardAttributes: IResolvable) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    override fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(DashboardAttributesProperty.Companion::unwrap))
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4a692f1ea2143d633e81ff1451b925182bdddc1301c184b2a2a0c2d86ed08ff")
    override
        fun dashboardAttributes(dashboardAttributes: DashboardAttributesProperty.Builder.() -> Unit):
        Unit = dashboardAttributes(DashboardAttributesProperty(dashboardAttributes))

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    override fun guardianAttributes(guardianAttributes: IResolvable) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    override fun guardianAttributes(guardianAttributes: GuardianAttributesProperty) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(GuardianAttributesProperty.Companion::unwrap))
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d456f0e3099a8dac0b7281769a5de33cc908e5afffc3f15fa111de935db37551")
    override
        fun guardianAttributes(guardianAttributes: GuardianAttributesProperty.Builder.() -> Unit):
        Unit = guardianAttributes(GuardianAttributesProperty(guardianAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnVdmAttributes = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnVdmAttributes.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVdmAttributes {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVdmAttributes(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes):
        CfnVdmAttributes = CfnVdmAttributes(cdkObject)

    internal fun unwrap(wrapped: CfnVdmAttributes):
        software.amazon.awscdk.services.ses.CfnVdmAttributes = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnVdmAttributes
  }

  /**
   * An object containing additional settings for your VDM configuration as applicable to the
   * Dashboard.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DashboardAttributesProperty dashboardAttributesProperty = DashboardAttributesProperty.builder()
   * .engagementMetrics("engagementMetrics")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-dashboardattributes.html)
   */
  public interface DashboardAttributesProperty {
    /**
     * Specifies the status of your VDM engagement metrics collection. Can be one of the following:.
     *
     * * `ENABLED` – Amazon SES enables engagement metrics for your account.
     * * `DISABLED` – Amazon SES disables engagement metrics for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-dashboardattributes.html#cfn-ses-vdmattributes-dashboardattributes-engagementmetrics)
     */
    public fun engagementMetrics(): String? = unwrap(this).getEngagementMetrics()

    /**
     * A builder for [DashboardAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param engagementMetrics Specifies the status of your VDM engagement metrics collection.
       * Can be one of the following:.
       * * `ENABLED` – Amazon SES enables engagement metrics for your account.
       * * `DISABLED` – Amazon SES disables engagement metrics for your account.
       */
      public fun engagementMetrics(engagementMetrics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty.builder()

      /**
       * @param engagementMetrics Specifies the status of your VDM engagement metrics collection.
       * Can be one of the following:.
       * * `ENABLED` – Amazon SES enables engagement metrics for your account.
       * * `DISABLED` – Amazon SES disables engagement metrics for your account.
       */
      override fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty,
    ) : CdkObject(cdkObject),
        DashboardAttributesProperty {
      /**
       * Specifies the status of your VDM engagement metrics collection. Can be one of the
       * following:.
       *
       * * `ENABLED` – Amazon SES enables engagement metrics for your account.
       * * `DISABLED` – Amazon SES disables engagement metrics for your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-dashboardattributes.html#cfn-ses-vdmattributes-dashboardattributes-engagementmetrics)
       */
      override fun engagementMetrics(): String? = unwrap(this).getEngagementMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashboardAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty):
          DashboardAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DashboardAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashboardAttributesProperty):
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnVdmAttributes.DashboardAttributesProperty
    }
  }

  /**
   * An object containing additional settings for your VDM configuration as applicable to the
   * Guardian.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * GuardianAttributesProperty guardianAttributesProperty = GuardianAttributesProperty.builder()
   * .optimizedSharedDelivery("optimizedSharedDelivery")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-guardianattributes.html)
   */
  public interface GuardianAttributesProperty {
    /**
     * Specifies the status of your VDM optimized shared delivery. Can be one of the following:.
     *
     * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
     * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-guardianattributes.html#cfn-ses-vdmattributes-guardianattributes-optimizedshareddelivery)
     */
    public fun optimizedSharedDelivery(): String? = unwrap(this).getOptimizedSharedDelivery()

    /**
     * A builder for [GuardianAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
       * Can be one of the following:.
       * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
       */
      public fun optimizedSharedDelivery(optimizedSharedDelivery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty.Builder =
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty.builder()

      /**
       * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery.
       * Can be one of the following:.
       * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
       */
      override fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty,
    ) : CdkObject(cdkObject),
        GuardianAttributesProperty {
      /**
       * Specifies the status of your VDM optimized shared delivery. Can be one of the following:.
       *
       * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
       * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-guardianattributes.html#cfn-ses-vdmattributes-guardianattributes-optimizedshareddelivery)
       */
      override fun optimizedSharedDelivery(): String? = unwrap(this).getOptimizedSharedDelivery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardianAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty):
          GuardianAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardianAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardianAttributesProperty):
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnVdmAttributes.GuardianAttributesProperty
    }
  }
}

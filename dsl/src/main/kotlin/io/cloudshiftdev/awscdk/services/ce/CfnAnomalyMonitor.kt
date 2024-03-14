package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnomalyMonitor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The date when the monitor was created.
   */
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  /**
   * The value for evaluated dimensions.
   */
  public open fun attrDimensionalValueCount(): Number = unwrap(this).getAttrDimensionalValueCount()

  /**
   * The date when the monitor last evaluated for anomalies.
   */
  public open fun attrLastEvaluatedDate(): String = unwrap(this).getAttrLastEvaluatedDate()

  /**
   * The date when the monitor was last updated.
   */
  public open fun attrLastUpdatedDate(): String = unwrap(this).getAttrLastUpdatedDate()

  /**
   * The Amazon Resource Name (ARN) value for the monitor.
   */
  public open fun attrMonitorArn(): String = unwrap(this).getAttrMonitorArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The dimensions to evaluate.
   */
  public open fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

  /**
   * The dimensions to evaluate.
   */
  public open fun monitorDimension(`value`: String) {
    unwrap(this).setMonitorDimension(`value`)
  }

  /**
   * The name of the monitor.
   */
  public open fun monitorName(): String = unwrap(this).getMonitorName()

  /**
   * The name of the monitor.
   */
  public open fun monitorName(`value`: String) {
    unwrap(this).setMonitorName(`value`)
  }

  /**
   * The array of `MonitorSpecification` in JSON array format.
   */
  public open fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

  /**
   * The array of `MonitorSpecification` in JSON array format.
   */
  public open fun monitorSpecification(`value`: String) {
    unwrap(this).setMonitorSpecification(`value`)
  }

  /**
   * The possible type values.
   */
  public open fun monitorType(): String = unwrap(this).getMonitorType()

  /**
   * The possible type values.
   */
  public open fun monitorType(`value`: String) {
    unwrap(this).setMonitorType(`value`)
  }

  /**
   * Tags to assign to monitor.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * Tags to assign to monitor.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tags to assign to monitor.
   */
  public open fun resourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(__idx_ac66f0)
  }

  /**
   * Tags to assign to monitor.
   */
  public open fun resourceTags(vararg __idx_ac66f0: Any): Unit = resourceTags(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ce.CfnAnomalyMonitor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The dimensions to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitordimension)
     * @param monitorDimension The dimensions to evaluate. 
     */
    public fun monitorDimension(monitorDimension: String)

    /**
     * The name of the monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorname)
     * @param monitorName The name of the monitor. 
     */
    public fun monitorName(monitorName: String)

    /**
     * The array of `MonitorSpecification` in JSON array format.
     *
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorspecification)
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format. 
     */
    public fun monitorSpecification(monitorSpecification: String)

    /**
     * The possible type values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitortype)
     * @param monitorType The possible type values. 
     */
    public fun monitorType(monitorType: String)

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder.create(scope, id)

    /**
     * The dimensions to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitordimension)
     * @param monitorDimension The dimensions to evaluate. 
     */
    override fun monitorDimension(monitorDimension: String) {
      cdkBuilder.monitorDimension(monitorDimension)
    }

    /**
     * The name of the monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorname)
     * @param monitorName The name of the monitor. 
     */
    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    /**
     * The array of `MonitorSpecification` in JSON array format.
     *
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorspecification)
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format. 
     */
    override fun monitorSpecification(monitorSpecification: String) {
      cdkBuilder.monitorSpecification(monitorSpecification)
    }

    /**
     * The possible type values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitortype)
     * @param monitorType The possible type values. 
     */
    override fun monitorType(monitorType: String) {
      cdkBuilder.monitorType(monitorType)
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     * @param resourceTags Tags to assign to monitor. 
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitor = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalyMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalyMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor):
        CfnAnomalyMonitor = CfnAnomalyMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyMonitor):
        software.amazon.awscdk.services.ce.CfnAnomalyMonitor = wrapped.cdkObject
  }

  public interface ResourceTagProperty {
    /**
     * The key that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html#cfn-ce-anomalymonitor-resourcetag-key)
     */
    public fun key(): String

    /**
     * The value that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html#cfn-ce-anomalymonitor-resourcetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that's associated with the tag. 
       */
      public fun key(key: String)

      /**
       * @param value The value that's associated with the tag. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty.builder()

      /**
       * @param key The key that's associated with the tag. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value that's associated with the tag. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty,
    ) : ResourceTagProperty {
      /**
       * The key that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html#cfn-ce-anomalymonitor-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html#cfn-ce-anomalymonitor-resourcetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

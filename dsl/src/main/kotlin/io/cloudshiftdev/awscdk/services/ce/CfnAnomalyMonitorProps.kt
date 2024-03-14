package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAnomalyMonitorProps {
  /**
   * The dimensions to evaluate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitordimension)
   */
  public fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

  /**
   * The name of the monitor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorname)
   */
  public fun monitorName(): String

  /**
   * The array of `MonitorSpecification` in JSON array format.
   *
   * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
   * account for your custom anomaly monitor. For further information, see the
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
   * section of this page.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorspecification)
   */
  public fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

  /**
   * The possible type values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitortype)
   */
  public fun monitorType(): String

  /**
   * Tags to assign to monitor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * A builder for [CfnAnomalyMonitorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param monitorDimension The dimensions to evaluate.
     */
    public fun monitorDimension(monitorDimension: String)

    /**
     * @param monitorName The name of the monitor. 
     */
    public fun monitorName(monitorName: String)

    /**
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format.
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     */
    public fun monitorSpecification(monitorSpecification: String)

    /**
     * @param monitorType The possible type values. 
     */
    public fun monitorType(monitorType: String)

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.builder()

    /**
     * @param monitorDimension The dimensions to evaluate.
     */
    override fun monitorDimension(monitorDimension: String) {
      cdkBuilder.monitorDimension(monitorDimension)
    }

    /**
     * @param monitorName The name of the monitor. 
     */
    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    /**
     * @param monitorSpecification The array of `MonitorSpecification` in JSON array format.
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     */
    override fun monitorSpecification(monitorSpecification: String) {
      cdkBuilder.monitorSpecification(monitorSpecification)
    }

    /**
     * @param monitorType The possible type values. 
     */
    override fun monitorType(monitorType: String) {
      cdkBuilder.monitorType(monitorType)
    }

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * @param resourceTags Tags to assign to monitor.
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps,
  ) : CdkObject(cdkObject), CfnAnomalyMonitorProps {
    /**
     * The dimensions to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitordimension)
     */
    override fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

    /**
     * The name of the monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorname)
     */
    override fun monitorName(): String = unwrap(this).getMonitorName()

    /**
     * The array of `MonitorSpecification` in JSON array format.
     *
     * For instance, you can use `MonitorSpecification` to specify a tag, Cost Category, or linked
     * account for your custom anomaly monitor. For further information, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#aws-resource-ce-anomalymonitor--examples)
     * section of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitorspecification)
     */
    override fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

    /**
     * The possible type values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-monitortype)
     */
    override fun monitorType(): String = unwrap(this).getMonitorType()

    /**
     * Tags to assign to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html#cfn-ce-anomalymonitor-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps):
        CfnAnomalyMonitorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyMonitorProps):
        software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps
  }
}

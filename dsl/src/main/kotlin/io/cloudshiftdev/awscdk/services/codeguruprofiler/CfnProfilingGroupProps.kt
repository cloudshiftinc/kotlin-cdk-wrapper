package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfilingGroupProps {
  /**
   * The agent permissions attached to this profiling group.
   *
   * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform actions
   * required by the profiling agent. The Json consists of key `Principals` .
   *
   * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
   * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
   * ARNs. An empty list is not permitted. This is a required key.
   *
   * For more information, see [Resource-based policies in CodeGuru
   * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html) in
   * the *Amazon CodeGuru Profiler user guide* ,
   * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
   * , and
   * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions)
   */
  public fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

  /**
   * Adds anomaly notifications for a profiling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
   */
  public fun anomalyDetectionNotificationConfiguration(): Any? =
      unwrap(this).getAnomalyDetectionNotificationConfiguration()

  /**
   * The compute platform of the profiling group.
   *
   * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application runs
   * on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises server,
   * or a different platform. If not specified, `Default` is used. This property is immutable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-computeplatform)
   */
  public fun computePlatform(): String? = unwrap(this).getComputePlatform()

  /**
   * The name of the profiling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname)
   */
  public fun profilingGroupName(): String

  /**
   * A list of tags to add to the created profiling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfilingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentPermissions The agent permissions attached to this profiling group.
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform
     * actions required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
     * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html)
     * in the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     */
    public fun agentPermissions(agentPermissions: Any)

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable)

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>)

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any)

    /**
     * @param computePlatform The compute platform of the profiling group.
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application
     * runs on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises
     * server, or a different platform. If not specified, `Default` is used. This property is
     * immutable.
     */
    public fun computePlatform(computePlatform: String)

    /**
     * @param profilingGroupName The name of the profiling group. 
     */
    public fun profilingGroupName(profilingGroupName: String)

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps.Builder =
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps.builder()

    /**
     * @param agentPermissions The agent permissions attached to this profiling group.
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform
     * actions required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
     * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html)
     * in the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     */
    override fun agentPermissions(agentPermissions: Any) {
      cdkBuilder.agentPermissions(agentPermissions)
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    override fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any): Unit =
        anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.toList())

    /**
     * @param computePlatform The compute platform of the profiling group.
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application
     * runs on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises
     * server, or a different platform. If not specified, `Default` is used. This property is
     * immutable.
     */
    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    /**
     * @param profilingGroupName The name of the profiling group. 
     */
    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps,
  ) : CdkObject(cdkObject), CfnProfilingGroupProps {
    /**
     * The agent permissions attached to this profiling group.
     *
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform
     * actions required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
     * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html)
     * in the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions)
     */
    override fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     */
    override fun anomalyDetectionNotificationConfiguration(): Any? =
        unwrap(this).getAnomalyDetectionNotificationConfiguration()

    /**
     * The compute platform of the profiling group.
     *
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application
     * runs on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises
     * server, or a different platform. If not specified, `Default` is used. This property is
     * immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-computeplatform)
     */
    override fun computePlatform(): String? = unwrap(this).getComputePlatform()

    /**
     * The name of the profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname)
     */
    override fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

    /**
     * A list of tags to add to the created profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfilingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps):
        CfnProfilingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfilingGroupProps):
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
  }
}

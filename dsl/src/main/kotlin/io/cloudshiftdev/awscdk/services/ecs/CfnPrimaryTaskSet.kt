package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPrimaryTaskSet
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
     * the task set exists in.
     */
    public open fun cluster(): String = unwrap(this).getCluster()

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
     * the task set exists in.
     */
    public open fun cluster(`value`: String) {
        unwrap(this).setCluster(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     */
    public open fun service(): String = unwrap(this).getService()

    /**
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     */
    public open fun service(`value`: String) {
        unwrap(this).setService(`value`)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
     * set in the deployment.
     */
    public open fun taskSetId(): String = unwrap(this).getTaskSetId()

    /**
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
     * set in the deployment.
     */
    public open fun taskSetId(`value`: String) {
        unwrap(this).setTaskSetId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnPrimaryTaskSet]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service
         * that the task set exists in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
         *
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
         *   hosts the service that the task set exists in.
         */
        public fun cluster(cluster: String)

        /**
         * The short name or full Amazon Resource Name (ARN) of the service that the task set exists
         * in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
         *
         * @param service The short name or full Amazon Resource Name (ARN) of the service that the
         *   task set exists in.
         */
        public fun service(service: String)

        /**
         * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary
         * task set in the deployment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
         *
         * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set
         *   as the primary task set in the deployment.
         */
        public fun taskSetId(taskSetId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder =
            software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder.create(scope, id)

        /**
         * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service
         * that the task set exists in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
         *
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
         *   hosts the service that the task set exists in.
         */
        override fun cluster(cluster: String) {
            cdkBuilder.cluster(cluster)
        }

        /**
         * The short name or full Amazon Resource Name (ARN) of the service that the task set exists
         * in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
         *
         * @param service The short name or full Amazon Resource Name (ARN) of the service that the
         *   task set exists in.
         */
        override fun service(service: String) {
            cdkBuilder.service(service)
        }

        /**
         * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary
         * task set in the deployment.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
         *
         * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set
         *   as the primary task set in the deployment.
         */
        override fun taskSetId(taskSetId: String) {
            cdkBuilder.taskSetId(taskSetId)
        }

        public fun build(): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPrimaryTaskSet {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPrimaryTaskSet(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
        ): CfnPrimaryTaskSet = CfnPrimaryTaskSet(cdkObject)

        internal fun unwrap(
            wrapped: CfnPrimaryTaskSet
        ): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet = wrapped.cdkObject
    }
}

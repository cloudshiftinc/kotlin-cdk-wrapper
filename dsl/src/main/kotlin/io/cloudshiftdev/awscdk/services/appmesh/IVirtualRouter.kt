package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IVirtualRouter : IResource {
    /**
     * Add a single route to the router.
     *
     * @param id
     * @param props
     */
    public fun addRoute(id: String, props: RouteBaseProps): Route

    /**
     * Add a single route to the router.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
    public fun addRoute(id: String, props: RouteBaseProps.Builder.() -> Unit): Route

    /** The Mesh which the VirtualRouter belongs to. */
    public fun mesh(): IMesh

    /** The Amazon Resource Name (ARN) for the VirtualRouter. */
    public fun virtualRouterArn(): String

    /** The name of the VirtualRouter. */
    public fun virtualRouterName(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter,
    ) : IVirtualRouter {
        /**
         * Add a single route to the router.
         *
         * @param id
         * @param props
         */
        override fun addRoute(id: String, props: RouteBaseProps): Route =
            unwrap(this).addRoute(id, props.let(RouteBaseProps::unwrap)).let(Route::wrap)

        /**
         * Add a single route to the router.
         *
         * @param id
         * @param props
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
        override fun addRoute(id: String, props: RouteBaseProps.Builder.() -> Unit): Route =
            addRoute(id, RouteBaseProps(props))

        /**
         * Apply the given removal policy to this resource.
         *
         * The Removal Policy controls what happens to this resource when it stops being managed by
         * CloudFormation, either because you've removed it from the CDK application or because
         * you've made a change that requires the resource to be replaced.
         *
         * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS account for
         * data recovery and cleanup later (`RemovalPolicy.RETAIN`).
         *
         * @param policy
         */
        override fun applyRemovalPolicy(policy: RemovalPolicy) {
            unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
        }

        /**
         * The environment this resource belongs to.
         *
         * For resources that are created and managed by the CDK (generally, those created by
         * creating new class instances like Role, Bucket, etc.), this is always the same as the
         * environment of the stack they belong to; however, for imported resources (those obtained
         * from static methods like fromRoleArn, fromBucketName, etc.), that might be different than
         * the stack they were imported into.
         */
        override fun env(): ResourceEnvironment =
            unwrap(this).getEnv().let(ResourceEnvironment::wrap)

        /** The Mesh which the VirtualRouter belongs to. */
        override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

        /** The Amazon Resource Name (ARN) for the VirtualRouter. */
        override fun virtualRouterArn(): String = unwrap(this).getVirtualRouterArn()

        /** The name of the VirtualRouter. */
        override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter
        ): IVirtualRouter = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IVirtualRouter
        ): software.amazon.awscdk.services.appmesh.IVirtualRouter = (wrapped as Wrapper).cdkObject
    }
}

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoute
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The full Amazon Resource Name (ARN) for the route. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The name of the service mesh that the route resides in. */
    public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see
     * [Working with Shared Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     * .
     */
    public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

    /**
     * The AWS IAM account ID of the resource owner.
     *
     * If the account ID is not your own, then it's the ID of the mesh owner or of another account
     * that the mesh is shared with. For more information about mesh sharing, see
     * [Working with Shared Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     * .
     */
    public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

    /** The name of the route. */
    public open fun attrRouteName(): String = unwrap(this).getAttrRouteName()

    /** The unique identifier for the route. */
    public open fun attrUid(): String = unwrap(this).getAttrUid()

    /** The name of the virtual router that the route is associated with. */
    public open fun attrVirtualRouterName(): String = unwrap(this).getAttrVirtualRouterName()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the service mesh to create the route in. */
    public open fun meshName(): String = unwrap(this).getMeshName()

    /** The name of the service mesh to create the route in. */
    public open fun meshName(`value`: String) {
        unwrap(this).setMeshName(`value`)
    }

    /** The AWS IAM account ID of the service mesh owner. */
    public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /** The AWS IAM account ID of the service mesh owner. */
    public open fun meshOwner(`value`: String) {
        unwrap(this).setMeshOwner(`value`)
    }

    /** The name to use for the route. */
    public open fun routeName(): String? = unwrap(this).getRouteName()

    /** The name to use for the route. */
    public open fun routeName(`value`: String) {
        unwrap(this).setRouteName(`value`)
    }

    /** The route specification to apply. */
    public open fun spec(): Any = unwrap(this).getSpec()

    /** The route specification to apply. */
    public open fun spec(`value`: IResolvable) {
        unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
    }

    /** The route specification to apply. */
    public open fun spec(`value`: RouteSpecProperty) {
        unwrap(this).setSpec(`value`.let(RouteSpecProperty::unwrap))
    }

    /** The route specification to apply. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37d15b17e758c33aa05b5db1d559f8b7497906b06f6973f34c47684ceed07b93")
    public open fun spec(`value`: RouteSpecProperty.Builder.() -> Unit): Unit =
        spec(RouteSpecProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the route to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The name of the virtual router in which to create the route. */
    public open fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()

    /** The name of the virtual router in which to create the route. */
    public open fun virtualRouterName(`value`: String) {
        unwrap(this).setVirtualRouterName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnRoute]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the service mesh to create the route in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
         *
         * @param meshName The name of the service mesh to create the route in.
         */
        public fun meshName(meshName: String)

        /**
         * The AWS IAM account ID of the service mesh owner.
         *
         * If the account ID is not your own, then the account that you specify must share the mesh
         * with your account before you can create the resource in the service mesh. For more
         * information about mesh sharing, see
         * [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
         *
         * @param meshOwner The AWS IAM account ID of the service mesh owner.
         */
        public fun meshOwner(meshOwner: String)

        /**
         * The name to use for the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
         *
         * @param routeName The name to use for the route.
         */
        public fun routeName(routeName: String)

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        public fun spec(spec: IResolvable)

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        public fun spec(spec: RouteSpecProperty)

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
        public fun spec(spec: RouteSpecProperty.Builder.() -> Unit)

        /**
         * Optional metadata that you can apply to the route to assist with categorization and
         * organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
         *
         * @param tags Optional metadata that you can apply to the route to assist with
         *   categorization and organization.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Optional metadata that you can apply to the route to assist with categorization and
         * organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
         *
         * @param tags Optional metadata that you can apply to the route to assist with
         *   categorization and organization.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The name of the virtual router in which to create the route.
         *
         * If the virtual router is in a shared mesh, then you must be the owner of the virtual
         * router resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
         *
         * @param virtualRouterName The name of the virtual router in which to create the route.
         */
        public fun virtualRouterName(virtualRouterName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnRoute.Builder =
            software.amazon.awscdk.services.appmesh.CfnRoute.Builder.create(scope, id)

        /**
         * The name of the service mesh to create the route in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshname)
         *
         * @param meshName The name of the service mesh to create the route in.
         */
        override fun meshName(meshName: String) {
            cdkBuilder.meshName(meshName)
        }

        /**
         * The AWS IAM account ID of the service mesh owner.
         *
         * If the account ID is not your own, then the account that you specify must share the mesh
         * with your account before you can create the resource in the service mesh. For more
         * information about mesh sharing, see
         * [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-meshowner)
         *
         * @param meshOwner The AWS IAM account ID of the service mesh owner.
         */
        override fun meshOwner(meshOwner: String) {
            cdkBuilder.meshOwner(meshOwner)
        }

        /**
         * The name to use for the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-routename)
         *
         * @param routeName The name to use for the route.
         */
        override fun routeName(routeName: String) {
            cdkBuilder.routeName(routeName)
        }

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        override fun spec(spec: IResolvable) {
            cdkBuilder.spec(spec.let(IResolvable::unwrap))
        }

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        override fun spec(spec: RouteSpecProperty) {
            cdkBuilder.spec(spec.let(RouteSpecProperty::unwrap))
        }

        /**
         * The route specification to apply.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-spec)
         *
         * @param spec The route specification to apply.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6bd3bb53228229fae0cceefb48e1b5851f9d5e3ca7080532dc3bf7a0b4e48d0c")
        override fun spec(spec: RouteSpecProperty.Builder.() -> Unit): Unit =
            spec(RouteSpecProperty(spec))

        /**
         * Optional metadata that you can apply to the route to assist with categorization and
         * organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
         *
         * @param tags Optional metadata that you can apply to the route to assist with
         *   categorization and organization.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Optional metadata that you can apply to the route to assist with categorization and
         * organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-tags)
         *
         * @param tags Optional metadata that you can apply to the route to assist with
         *   categorization and organization.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The name of the virtual router in which to create the route.
         *
         * If the virtual router is in a shared mesh, then you must be the owner of the virtual
         * router resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html#cfn-appmesh-route-virtualroutername)
         *
         * @param virtualRouterName The name of the virtual router in which to create the route.
         */
        override fun virtualRouterName(virtualRouterName: String) {
            cdkBuilder.virtualRouterName(virtualRouterName)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnRoute {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnRoute(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute): CfnRoute =
            CfnRoute(cdkObject)

        internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.appmesh.CfnRoute =
            wrapped.cdkObject
    }

    public interface HttpPathMatchProperty {
        /**
         * The exact path to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-exact)
         */
        public fun exact(): String? = unwrap(this).getExact()

        /**
         * The regex used to match the path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-regex)
         */
        public fun regex(): String? = unwrap(this).getRegex()

        /** A builder for [HttpPathMatchProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param exact The exact path to match on. */
            public fun exact(exact: String)

            /** @param regex The regex used to match the path. */
            public fun regex(regex: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.builder()

            /** @param exact The exact path to match on. */
            override fun exact(exact: String) {
                cdkBuilder.exact(exact)
            }

            /** @param regex The regex used to match the path. */
            override fun regex(regex: String) {
                cdkBuilder.regex(regex)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty,
        ) : HttpPathMatchProperty {
            /**
             * The exact path to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-exact)
             */
            override fun exact(): String? = unwrap(this).getExact()

            /**
             * The regex used to match the path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html#cfn-appmesh-route-httppathmatch-regex)
             */
            override fun regex(): String? = unwrap(this).getRegex()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpPathMatchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty
            ): HttpPathMatchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpPathMatchProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RouteSpecProperty {
        /**
         * An object that represents the specification of a gRPC route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-grpcroute)
         */
        public fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

        /**
         * An object that represents the specification of an HTTP/2 route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-http2route)
         */
        public fun http2Route(): Any? = unwrap(this).getHttp2Route()

        /**
         * An object that represents the specification of an HTTP route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-httproute)
         */
        public fun httpRoute(): Any? = unwrap(this).getHttpRoute()

        /**
         * The priority for the route.
         *
         * Routes are matched based on the specified value, where 0 is the highest priority.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority)
         */
        public fun priority(): Number? = unwrap(this).getPriority()

        /**
         * An object that represents the specification of a TCP route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-tcproute)
         */
        public fun tcpRoute(): Any? = unwrap(this).getTcpRoute()

        /** A builder for [RouteSpecProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            public fun grpcRoute(grpcRoute: IResolvable)

            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            public fun grpcRoute(grpcRoute: GrpcRouteProperty)

            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
            public fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit)

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            public fun http2Route(http2Route: IResolvable)

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            public fun http2Route(http2Route: HttpRouteProperty)

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
            public fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit)

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            public fun httpRoute(httpRoute: IResolvable)

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            public fun httpRoute(httpRoute: HttpRouteProperty)

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
            public fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit)

            /**
             * @param priority The priority for the route. Routes are matched based on the specified
             *   value, where 0 is the highest priority.
             */
            public fun priority(priority: Number)

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            public fun tcpRoute(tcpRoute: IResolvable)

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            public fun tcpRoute(tcpRoute: TcpRouteProperty)

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
            public fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.builder()

            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            override fun grpcRoute(grpcRoute: IResolvable) {
                cdkBuilder.grpcRoute(grpcRoute.let(IResolvable::unwrap))
            }

            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            override fun grpcRoute(grpcRoute: GrpcRouteProperty) {
                cdkBuilder.grpcRoute(grpcRoute.let(GrpcRouteProperty::unwrap))
            }

            /** @param grpcRoute An object that represents the specification of a gRPC route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cbdadec527d34bd78b39af2dfdbbc42bb4df8c408da6f690eeb5fa7bb6ddcc74")
            override fun grpcRoute(grpcRoute: GrpcRouteProperty.Builder.() -> Unit): Unit =
                grpcRoute(GrpcRouteProperty(grpcRoute))

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            override fun http2Route(http2Route: IResolvable) {
                cdkBuilder.http2Route(http2Route.let(IResolvable::unwrap))
            }

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            override fun http2Route(http2Route: HttpRouteProperty) {
                cdkBuilder.http2Route(http2Route.let(HttpRouteProperty::unwrap))
            }

            /** @param http2Route An object that represents the specification of an HTTP/2 route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("26be42793e7e56ac8156a7a3284fd66a3d2eaf90bc800164b5789df69578b60f")
            override fun http2Route(http2Route: HttpRouteProperty.Builder.() -> Unit): Unit =
                http2Route(HttpRouteProperty(http2Route))

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            override fun httpRoute(httpRoute: IResolvable) {
                cdkBuilder.httpRoute(httpRoute.let(IResolvable::unwrap))
            }

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            override fun httpRoute(httpRoute: HttpRouteProperty) {
                cdkBuilder.httpRoute(httpRoute.let(HttpRouteProperty::unwrap))
            }

            /** @param httpRoute An object that represents the specification of an HTTP route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fbeb9b2b8b24dafc5b8f75a639849958e9396b9f9e5e302cea9154cb782f3573")
            override fun httpRoute(httpRoute: HttpRouteProperty.Builder.() -> Unit): Unit =
                httpRoute(HttpRouteProperty(httpRoute))

            /**
             * @param priority The priority for the route. Routes are matched based on the specified
             *   value, where 0 is the highest priority.
             */
            override fun priority(priority: Number) {
                cdkBuilder.priority(priority)
            }

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            override fun tcpRoute(tcpRoute: IResolvable) {
                cdkBuilder.tcpRoute(tcpRoute.let(IResolvable::unwrap))
            }

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            override fun tcpRoute(tcpRoute: TcpRouteProperty) {
                cdkBuilder.tcpRoute(tcpRoute.let(TcpRouteProperty::unwrap))
            }

            /** @param tcpRoute An object that represents the specification of a TCP route. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("959cbe7f10e9b2da8b439898cdb3ad12ea06da8821e030a6c35a46c900dc6c49")
            override fun tcpRoute(tcpRoute: TcpRouteProperty.Builder.() -> Unit): Unit =
                tcpRoute(TcpRouteProperty(tcpRoute))

            public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty,
        ) : RouteSpecProperty {
            /**
             * An object that represents the specification of a gRPC route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-grpcroute)
             */
            override fun grpcRoute(): Any? = unwrap(this).getGrpcRoute()

            /**
             * An object that represents the specification of an HTTP/2 route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-http2route)
             */
            override fun http2Route(): Any? = unwrap(this).getHttp2Route()

            /**
             * An object that represents the specification of an HTTP route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-httproute)
             */
            override fun httpRoute(): Any? = unwrap(this).getHttpRoute()

            /**
             * The priority for the route.
             *
             * Routes are matched based on the specified value, where 0 is the highest priority.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-priority)
             */
            override fun priority(): Number? = unwrap(this).getPriority()

            /**
             * An object that represents the specification of a TCP route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html#cfn-appmesh-route-routespec-tcproute)
             */
            override fun tcpRoute(): Any? = unwrap(this).getTcpRoute()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty
            ): RouteSpecProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RouteSpecProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRetryPolicyProperty {
        /**
         * Specify at least one of the valid values.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents)
         */
        public fun grpcRetryEvents(): List<String> =
            unwrap(this).getGrpcRetryEvents() ?: emptyList()

        /**
         * Specify at least one of the following values.
         * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510,
         *   and 511
         * * *gateway-error* – HTTP status codes 502, 503, and 504
         * * *client-error* – HTTP status code 409
         * * *stream-error* – Retry on refused stream
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents)
         */
        public fun httpRetryEvents(): List<String> =
            unwrap(this).getHttpRetryEvents() ?: emptyList()

        /**
         * The maximum number of retry attempts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries)
         */
        public fun maxRetries(): Number

        /**
         * The timeout for each retry attempt.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-perretrytimeout)
         */
        public fun perRetryTimeout(): Any

        /**
         * Specify a valid value.
         *
         * The event occurs before any processing of a request has started and is encountered when
         * the upstream is temporarily or permanently unavailable.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents)
         */
        public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

        /** A builder for [GrpcRetryPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param grpcRetryEvents Specify at least one of the valid values. */
            public fun grpcRetryEvents(grpcRetryEvents: List<String>)

            /** @param grpcRetryEvents Specify at least one of the valid values. */
            public fun grpcRetryEvents(vararg grpcRetryEvents: String)

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            public fun httpRetryEvents(httpRetryEvents: List<String>)

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            public fun httpRetryEvents(vararg httpRetryEvents: String)

            /** @param maxRetries The maximum number of retry attempts. */
            public fun maxRetries(maxRetries: Number)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            public fun perRetryTimeout(perRetryTimeout: IResolvable)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            public fun perRetryTimeout(perRetryTimeout: DurationProperty)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
            public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit)

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            public fun tcpRetryEvents(tcpRetryEvents: List<String>)

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            public fun tcpRetryEvents(vararg tcpRetryEvents: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.builder()

            /** @param grpcRetryEvents Specify at least one of the valid values. */
            override fun grpcRetryEvents(grpcRetryEvents: List<String>) {
                cdkBuilder.grpcRetryEvents(grpcRetryEvents)
            }

            /** @param grpcRetryEvents Specify at least one of the valid values. */
            override fun grpcRetryEvents(vararg grpcRetryEvents: String): Unit =
                grpcRetryEvents(grpcRetryEvents.toList())

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            override fun httpRetryEvents(httpRetryEvents: List<String>) {
                cdkBuilder.httpRetryEvents(httpRetryEvents)
            }

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            override fun httpRetryEvents(vararg httpRetryEvents: String): Unit =
                httpRetryEvents(httpRetryEvents.toList())

            /** @param maxRetries The maximum number of retry attempts. */
            override fun maxRetries(maxRetries: Number) {
                cdkBuilder.maxRetries(maxRetries)
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            override fun perRetryTimeout(perRetryTimeout: IResolvable) {
                cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
                cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0f84d4790e12379b813a871dc18f0d69c391e54d630a717cf6e9948bd0f55ff5")
            override fun perRetryTimeout(
                perRetryTimeout: DurationProperty.Builder.() -> Unit
            ): Unit = perRetryTimeout(DurationProperty(perRetryTimeout))

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
                cdkBuilder.tcpRetryEvents(tcpRetryEvents)
            }

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            override fun tcpRetryEvents(vararg tcpRetryEvents: String): Unit =
                tcpRetryEvents(tcpRetryEvents.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty,
        ) : GrpcRetryPolicyProperty {
            /**
             * Specify at least one of the valid values.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-grpcretryevents)
             */
            override fun grpcRetryEvents(): List<String> =
                unwrap(this).getGrpcRetryEvents() ?: emptyList()

            /**
             * Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-httpretryevents)
             */
            override fun httpRetryEvents(): List<String> =
                unwrap(this).getHttpRetryEvents() ?: emptyList()

            /**
             * The maximum number of retry attempts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-maxretries)
             */
            override fun maxRetries(): Number = unwrap(this).getMaxRetries()

            /**
             * The timeout for each retry attempt.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-perretrytimeout)
             */
            override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

            /**
             * Specify a valid value.
             *
             * The event occurs before any processing of a request has started and is encountered
             * when the upstream is temporarily or permanently unavailable.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html#cfn-appmesh-route-grpcretrypolicy-tcpretryevents)
             */
            override fun tcpRetryEvents(): List<String> =
                unwrap(this).getTcpRetryEvents() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRetryPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty
            ): GrpcRetryPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRetryPolicyProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TcpRouteActionProperty {
        /**
         * An object that represents the targets that traffic is routed to when a request matches
         * the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets)
         */
        public fun weightedTargets(): Any

        /** A builder for [TcpRouteActionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: IResolvable)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: List<Any>)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(vararg weightedTargets: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.builder()

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: IResolvable) {
                cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: List<Any>) {
                cdkBuilder.weightedTargets(weightedTargets)
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(vararg weightedTargets: Any): Unit =
                weightedTargets(weightedTargets.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty,
        ) : TcpRouteActionProperty {
            /**
             * An object that represents the targets that traffic is routed to when a request
             * matches the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html#cfn-appmesh-route-tcprouteaction-weightedtargets)
             */
            override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteActionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty
            ): TcpRouteActionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TcpRouteActionProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpQueryParameterMatchProperty {
        /**
         * The exact query parameter to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html#cfn-appmesh-route-httpqueryparametermatch-exact)
         */
        public fun exact(): String? = unwrap(this).getExact()

        /** A builder for [HttpQueryParameterMatchProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param exact The exact query parameter to match on. */
            public fun exact(exact: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty
                    .builder()

            /** @param exact The exact query parameter to match on. */
            override fun exact(exact: String) {
                cdkBuilder.exact(exact)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty,
        ) : HttpQueryParameterMatchProperty {
            /**
             * The exact query parameter to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html#cfn-appmesh-route-httpqueryparametermatch-exact)
             */
            override fun exact(): String? = unwrap(this).getExact()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): HttpQueryParameterMatchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty
            ): HttpQueryParameterMatchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpQueryParameterMatchProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRouteActionProperty {
        /**
         * An object that represents the targets that traffic is routed to when a request matches
         * the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets)
         */
        public fun weightedTargets(): Any

        /** A builder for [GrpcRouteActionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: IResolvable)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: List<Any>)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(vararg weightedTargets: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.builder()

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: IResolvable) {
                cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: List<Any>) {
                cdkBuilder.weightedTargets(weightedTargets)
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(vararg weightedTargets: Any): Unit =
                weightedTargets(weightedTargets.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty,
        ) : GrpcRouteActionProperty {
            /**
             * An object that represents the targets that traffic is routed to when a request
             * matches the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html#cfn-appmesh-route-grpcrouteaction-weightedtargets)
             */
            override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteActionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty
            ): GrpcRouteActionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRouteActionProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TcpRouteMatchProperty {
        /**
         * The port number to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html#cfn-appmesh-route-tcproutematch-port)
         */
        public fun port(): Number? = unwrap(this).getPort()

        /** A builder for [TcpRouteMatchProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param port The port number to match on. */
            public fun port(port: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty.builder()

            /** @param port The port number to match on. */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty,
        ) : TcpRouteMatchProperty {
            /**
             * The port number to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html#cfn-appmesh-route-tcproutematch-port)
             */
            override fun port(): Number? = unwrap(this).getPort()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteMatchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty
            ): TcpRouteMatchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TcpRouteMatchProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteMatchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpRouteMatchProperty {
        /**
         * The client request headers to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers)
         */
        public fun headers(): Any? = unwrap(this).getHeaders()

        /**
         * The client request method to match on.
         *
         * Specify only one.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method)
         */
        public fun method(): String? = unwrap(this).getMethod()

        /**
         * The client request path to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-path)
         */
        public fun path(): Any? = unwrap(this).getPath()

        /**
         * The port number to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-port)
         */
        public fun port(): Number? = unwrap(this).getPort()

        /**
         * Specifies the path to match requests with.
         *
         * This parameter must always start with `/` , which by itself matches all requests to the
         * virtual service name. You can also match for path-based routing of requests. For example,
         * if your virtual service name is `my-service.local` and you want the route to match
         * requests to `my-service.local/metrics` , your prefix should be `/metrics` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix)
         */
        public fun prefix(): String? = unwrap(this).getPrefix()

        /**
         * The client request query parameters to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-queryparameters)
         */
        public fun queryParameters(): Any? = unwrap(this).getQueryParameters()

        /**
         * The client request scheme to match on.
         *
         * Specify only one. Applicable only for HTTP2 routes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme)
         */
        public fun scheme(): String? = unwrap(this).getScheme()

        /** A builder for [HttpRouteMatchProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param headers The client request headers to match on. */
            public fun headers(headers: IResolvable)

            /** @param headers The client request headers to match on. */
            public fun headers(headers: List<Any>)

            /** @param headers The client request headers to match on. */
            public fun headers(vararg headers: Any)

            /** @param method The client request method to match on. Specify only one. */
            public fun method(method: String)

            /** @param path The client request path to match on. */
            public fun path(path: IResolvable)

            /** @param path The client request path to match on. */
            public fun path(path: HttpPathMatchProperty)

            /** @param path The client request path to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
            public fun path(path: HttpPathMatchProperty.Builder.() -> Unit)

            /** @param port The port number to match on. */
            public fun port(port: Number)

            /**
             * @param prefix Specifies the path to match requests with. This parameter must always
             *   start with `/` , which by itself matches all requests to the virtual service name.
             *   You can also match for path-based routing of requests. For example, if your virtual
             *   service name is `my-service.local` and you want the route to match requests to
             *   `my-service.local/metrics` , your prefix should be `/metrics` .
             */
            public fun prefix(prefix: String)

            /** @param queryParameters The client request query parameters to match on. */
            public fun queryParameters(queryParameters: IResolvable)

            /** @param queryParameters The client request query parameters to match on. */
            public fun queryParameters(queryParameters: List<Any>)

            /** @param queryParameters The client request query parameters to match on. */
            public fun queryParameters(vararg queryParameters: Any)

            /**
             * @param scheme The client request scheme to match on. Specify only one. Applicable
             *   only for HTTP2 routes.
             */
            public fun scheme(scheme: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty.builder()

            /** @param headers The client request headers to match on. */
            override fun headers(headers: IResolvable) {
                cdkBuilder.headers(headers.let(IResolvable::unwrap))
            }

            /** @param headers The client request headers to match on. */
            override fun headers(headers: List<Any>) {
                cdkBuilder.headers(headers)
            }

            /** @param headers The client request headers to match on. */
            override fun headers(vararg headers: Any): Unit = headers(headers.toList())

            /** @param method The client request method to match on. Specify only one. */
            override fun method(method: String) {
                cdkBuilder.method(method)
            }

            /** @param path The client request path to match on. */
            override fun path(path: IResolvable) {
                cdkBuilder.path(path.let(IResolvable::unwrap))
            }

            /** @param path The client request path to match on. */
            override fun path(path: HttpPathMatchProperty) {
                cdkBuilder.path(path.let(HttpPathMatchProperty::unwrap))
            }

            /** @param path The client request path to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("009420f2969a20c35f935fa5a7d88970b02cead52cdf6653a70335ca15e7b8cb")
            override fun path(path: HttpPathMatchProperty.Builder.() -> Unit): Unit =
                path(HttpPathMatchProperty(path))

            /** @param port The port number to match on. */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            /**
             * @param prefix Specifies the path to match requests with. This parameter must always
             *   start with `/` , which by itself matches all requests to the virtual service name.
             *   You can also match for path-based routing of requests. For example, if your virtual
             *   service name is `my-service.local` and you want the route to match requests to
             *   `my-service.local/metrics` , your prefix should be `/metrics` .
             */
            override fun prefix(prefix: String) {
                cdkBuilder.prefix(prefix)
            }

            /** @param queryParameters The client request query parameters to match on. */
            override fun queryParameters(queryParameters: IResolvable) {
                cdkBuilder.queryParameters(queryParameters.let(IResolvable::unwrap))
            }

            /** @param queryParameters The client request query parameters to match on. */
            override fun queryParameters(queryParameters: List<Any>) {
                cdkBuilder.queryParameters(queryParameters)
            }

            /** @param queryParameters The client request query parameters to match on. */
            override fun queryParameters(vararg queryParameters: Any): Unit =
                queryParameters(queryParameters.toList())

            /**
             * @param scheme The client request scheme to match on. Specify only one. Applicable
             *   only for HTTP2 routes.
             */
            override fun scheme(scheme: String) {
                cdkBuilder.scheme(scheme)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty,
        ) : HttpRouteMatchProperty {
            /**
             * The client request headers to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-headers)
             */
            override fun headers(): Any? = unwrap(this).getHeaders()

            /**
             * The client request method to match on.
             *
             * Specify only one.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-method)
             */
            override fun method(): String? = unwrap(this).getMethod()

            /**
             * The client request path to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-path)
             */
            override fun path(): Any? = unwrap(this).getPath()

            /**
             * The port number to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-port)
             */
            override fun port(): Number? = unwrap(this).getPort()

            /**
             * Specifies the path to match requests with.
             *
             * This parameter must always start with `/` , which by itself matches all requests to
             * the virtual service name. You can also match for path-based routing of requests. For
             * example, if your virtual service name is `my-service.local` and you want the route to
             * match requests to `my-service.local/metrics` , your prefix should be `/metrics` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-prefix)
             */
            override fun prefix(): String? = unwrap(this).getPrefix()

            /**
             * The client request query parameters to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-queryparameters)
             */
            override fun queryParameters(): Any? = unwrap(this).getQueryParameters()

            /**
             * The client request scheme to match on.
             *
             * Specify only one. Applicable only for HTTP2 routes.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html#cfn-appmesh-route-httproutematch-scheme)
             */
            override fun scheme(): String? = unwrap(this).getScheme()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty
            ): HttpRouteMatchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpRouteMatchProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRouteProperty {
        /**
         * An object that represents the action to take if a match is determined.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-action)
         */
        public fun action(): Any

        /**
         * An object that represents the criteria for determining a request match.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-match)
         */
        public fun match(): Any

        /**
         * An object that represents a retry policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-retrypolicy)
         */
        public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

        /**
         * An object that represents types of timeouts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-timeout)
         */
        public fun timeout(): Any? = unwrap(this).getTimeout()

        /** A builder for [GrpcRouteProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            public fun action(action: IResolvable)

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            public fun action(action: GrpcRouteActionProperty)

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
            public fun action(action: GrpcRouteActionProperty.Builder.() -> Unit)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: IResolvable)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: GrpcRouteMatchProperty)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
            public fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit)

            /** @param retryPolicy An object that represents a retry policy. */
            public fun retryPolicy(retryPolicy: IResolvable)

            /** @param retryPolicy An object that represents a retry policy. */
            public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty)

            /** @param retryPolicy An object that represents a retry policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
            public fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: IResolvable)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: GrpcTimeoutProperty)

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
            public fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.builder()

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            override fun action(action: IResolvable) {
                cdkBuilder.action(action.let(IResolvable::unwrap))
            }

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            override fun action(action: GrpcRouteActionProperty) {
                cdkBuilder.action(action.let(GrpcRouteActionProperty::unwrap))
            }

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("deb356349d43b14b819c27ec44bcfabbef82f200fa82ab4ce6c3de51f38ac167")
            override fun action(action: GrpcRouteActionProperty.Builder.() -> Unit): Unit =
                action(GrpcRouteActionProperty(action))

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: GrpcRouteMatchProperty) {
                cdkBuilder.match(match.let(GrpcRouteMatchProperty::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("009ee1182c5e9df562b3e667c43d88998718ea63df21ccdbb5c29ecaacdd6a4e")
            override fun match(match: GrpcRouteMatchProperty.Builder.() -> Unit): Unit =
                match(GrpcRouteMatchProperty(match))

            /** @param retryPolicy An object that represents a retry policy. */
            override fun retryPolicy(retryPolicy: IResolvable) {
                cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
            }

            /** @param retryPolicy An object that represents a retry policy. */
            override fun retryPolicy(retryPolicy: GrpcRetryPolicyProperty) {
                cdkBuilder.retryPolicy(retryPolicy.let(GrpcRetryPolicyProperty::unwrap))
            }

            /** @param retryPolicy An object that represents a retry policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2d0404dbdc3e4067a9ee29cf3c155d2a25d2a1e53f23d6a731943ab905531f27")
            override fun retryPolicy(
                retryPolicy: GrpcRetryPolicyProperty.Builder.() -> Unit
            ): Unit = retryPolicy(GrpcRetryPolicyProperty(retryPolicy))

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: IResolvable) {
                cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: GrpcTimeoutProperty) {
                cdkBuilder.timeout(timeout.let(GrpcTimeoutProperty::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1ab6b3ffbf90f3d4463628beddf62a71100df5d666e0c39dcc5df20e8cd51c80")
            override fun timeout(timeout: GrpcTimeoutProperty.Builder.() -> Unit): Unit =
                timeout(GrpcTimeoutProperty(timeout))

            public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty,
        ) : GrpcRouteProperty {
            /**
             * An object that represents the action to take if a match is determined.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-action)
             */
            override fun action(): Any = unwrap(this).getAction()

            /**
             * An object that represents the criteria for determining a request match.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-match)
             */
            override fun match(): Any = unwrap(this).getMatch()

            /**
             * An object that represents a retry policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-retrypolicy)
             */
            override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

            /**
             * An object that represents types of timeouts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html#cfn-appmesh-route-grpcroute-timeout)
             */
            override fun timeout(): Any? = unwrap(this).getTimeout()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty
            ): GrpcRouteProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRouteProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpRouteActionProperty {
        /**
         * An object that represents the targets that traffic is routed to when a request matches
         * the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html#cfn-appmesh-route-httprouteaction-weightedtargets)
         */
        public fun weightedTargets(): Any

        /** A builder for [HttpRouteActionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: IResolvable)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(weightedTargets: List<Any>)

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            public fun weightedTargets(vararg weightedTargets: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.builder()

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: IResolvable) {
                cdkBuilder.weightedTargets(weightedTargets.let(IResolvable::unwrap))
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(weightedTargets: List<Any>) {
                cdkBuilder.weightedTargets(weightedTargets)
            }

            /**
             * @param weightedTargets An object that represents the targets that traffic is routed
             *   to when a request matches the route.
             */
            override fun weightedTargets(vararg weightedTargets: Any): Unit =
                weightedTargets(weightedTargets.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty,
        ) : HttpRouteActionProperty {
            /**
             * An object that represents the targets that traffic is routed to when a request
             * matches the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html#cfn-appmesh-route-httprouteaction-weightedtargets)
             */
            override fun weightedTargets(): Any = unwrap(this).getWeightedTargets()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteActionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty
            ): HttpRouteActionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpRouteActionProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MatchRangeProperty {
        /**
         * The end of the range.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-end)
         */
        public fun end(): Number

        /**
         * The start of the range.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-start)
         */
        public fun start(): Number

        /** A builder for [MatchRangeProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param end The end of the range. */
            public fun end(end: Number)

            /** @param start The start of the range. */
            public fun start(start: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.builder()

            /** @param end The end of the range. */
            override fun end(end: Number) {
                cdkBuilder.end(end)
            }

            /** @param start The start of the range. */
            override fun start(start: Number) {
                cdkBuilder.start(start)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty,
        ) : MatchRangeProperty {
            /**
             * The end of the range.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-end)
             */
            override fun end(): Number = unwrap(this).getEnd()

            /**
             * The start of the range.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html#cfn-appmesh-route-matchrange-start)
             */
            override fun start(): Number = unwrap(this).getStart()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MatchRangeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty
            ): MatchRangeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MatchRangeProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TcpRouteProperty {
        /**
         * The action to take if a match is determined.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-action)
         */
        public fun action(): Any

        /**
         * An object that represents the criteria for determining a request match.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-match)
         */
        public fun match(): Any? = unwrap(this).getMatch()

        /**
         * An object that represents types of timeouts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-timeout)
         */
        public fun timeout(): Any? = unwrap(this).getTimeout()

        /** A builder for [TcpRouteProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param action The action to take if a match is determined. */
            public fun action(action: IResolvable)

            /** @param action The action to take if a match is determined. */
            public fun action(action: TcpRouteActionProperty)

            /** @param action The action to take if a match is determined. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
            public fun action(action: TcpRouteActionProperty.Builder.() -> Unit)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: IResolvable)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: TcpRouteMatchProperty)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
            public fun match(match: TcpRouteMatchProperty.Builder.() -> Unit)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: IResolvable)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: TcpTimeoutProperty)

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
            public fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty.builder()

            /** @param action The action to take if a match is determined. */
            override fun action(action: IResolvable) {
                cdkBuilder.action(action.let(IResolvable::unwrap))
            }

            /** @param action The action to take if a match is determined. */
            override fun action(action: TcpRouteActionProperty) {
                cdkBuilder.action(action.let(TcpRouteActionProperty::unwrap))
            }

            /** @param action The action to take if a match is determined. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("62d055f4c1c68793ad51559c95d77ed9a50b791fecfd73686943286c1198917a")
            override fun action(action: TcpRouteActionProperty.Builder.() -> Unit): Unit =
                action(TcpRouteActionProperty(action))

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: TcpRouteMatchProperty) {
                cdkBuilder.match(match.let(TcpRouteMatchProperty::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f42835d85357504b2baa3fad47e076d767de55be0a7faf135b1bc2002132c891")
            override fun match(match: TcpRouteMatchProperty.Builder.() -> Unit): Unit =
                match(TcpRouteMatchProperty(match))

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: IResolvable) {
                cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: TcpTimeoutProperty) {
                cdkBuilder.timeout(timeout.let(TcpTimeoutProperty::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("41979e326604c0b0b062081fded5dec4fd8a862e343227bcbed8b3baefb8de87")
            override fun timeout(timeout: TcpTimeoutProperty.Builder.() -> Unit): Unit =
                timeout(TcpTimeoutProperty(timeout))

            public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty,
        ) : TcpRouteProperty {
            /**
             * The action to take if a match is determined.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-action)
             */
            override fun action(): Any = unwrap(this).getAction()

            /**
             * An object that represents the criteria for determining a request match.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-match)
             */
            override fun match(): Any? = unwrap(this).getMatch()

            /**
             * An object that represents types of timeouts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html#cfn-appmesh-route-tcproute-timeout)
             */
            override fun timeout(): Any? = unwrap(this).getTimeout()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty
            ): TcpRouteProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TcpRouteProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TcpTimeoutProperty {
        /**
         * An object that represents an idle timeout.
         *
         * An idle timeout bounds the amount of time that a connection may be idle. The default
         * value is none.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html#cfn-appmesh-route-tcptimeout-idle)
         */
        public fun idle(): Any? = unwrap(this).getIdle()

        /** A builder for [TcpTimeoutProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: IResolvable)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: DurationProperty)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
            public fun idle(idle: DurationProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty.builder()

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: IResolvable) {
                cdkBuilder.idle(idle.let(IResolvable::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: DurationProperty) {
                cdkBuilder.idle(idle.let(DurationProperty::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1c4160b98941c730a1e2015fb21c37469fa386be6106183c7f29c91982b2f7a7")
            override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
                idle(DurationProperty(idle))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty,
        ) : TcpTimeoutProperty {
            /**
             * An object that represents an idle timeout.
             *
             * An idle timeout bounds the amount of time that a connection may be idle. The default
             * value is none.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html#cfn-appmesh-route-tcptimeout-idle)
             */
            override fun idle(): Any? = unwrap(this).getIdle()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeoutProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty
            ): TcpTimeoutProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TcpTimeoutProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpTimeoutProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcTimeoutProperty {
        /**
         * An object that represents an idle timeout.
         *
         * An idle timeout bounds the amount of time that a connection may be idle. The default
         * value is none.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-idle)
         */
        public fun idle(): Any? = unwrap(this).getIdle()

        /**
         * An object that represents a per request timeout.
         *
         * The default value is 15 seconds. If you set a higher timeout, then make sure that the
         * higher value is set for each App Mesh resource in a conversation. For example, if a
         * virtual node backend uses a virtual router provider to route to another virtual node,
         * then the timeout should be greater than 15 seconds for the source and destination virtual
         * node and the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-perrequest)
         */
        public fun perRequest(): Any? = unwrap(this).getPerRequest()

        /** A builder for [GrpcTimeoutProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: IResolvable)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: DurationProperty)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
            public fun idle(idle: DurationProperty.Builder.() -> Unit)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            public fun perRequest(perRequest: IResolvable)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            public fun perRequest(perRequest: DurationProperty)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
            public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty.builder()

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: IResolvable) {
                cdkBuilder.idle(idle.let(IResolvable::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: DurationProperty) {
                cdkBuilder.idle(idle.let(DurationProperty::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("95c5794f36a0a9c9668fb52ca7fb2a4b5c359637bc1d4d2ed2cb6b36aef36fdf")
            override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
                idle(DurationProperty(idle))

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            override fun perRequest(perRequest: IResolvable) {
                cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
            }

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            override fun perRequest(perRequest: DurationProperty) {
                cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
            }

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f5438550ba4fd648dc25d25dc5a576a858788355a6ecf2edae71d1633f3f004b")
            override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
                perRequest(DurationProperty(perRequest))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty,
        ) : GrpcTimeoutProperty {
            /**
             * An object that represents an idle timeout.
             *
             * An idle timeout bounds the amount of time that a connection may be idle. The default
             * value is none.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-idle)
             */
            override fun idle(): Any? = unwrap(this).getIdle()

            /**
             * An object that represents a per request timeout.
             *
             * The default value is 15 seconds. If you set a higher timeout, then make sure that the
             * higher value is set for each App Mesh resource in a conversation. For example, if a
             * virtual node backend uses a virtual router provider to route to another virtual node,
             * then the timeout should be greater than 15 seconds for the source and destination
             * virtual node and the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html#cfn-appmesh-route-grpctimeout-perrequest)
             */
            override fun perRequest(): Any? = unwrap(this).getPerRequest()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcTimeoutProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty
            ): GrpcTimeoutProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcTimeoutProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpRouteHeaderProperty {
        /**
         * Specify `True` to match anything except the match criteria.
         *
         * The default value is `False` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert)
         */
        public fun invert(): Any? = unwrap(this).getInvert()

        /**
         * The `HeaderMatchMethod` object.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-match)
         */
        public fun match(): Any? = unwrap(this).getMatch()

        /**
         * A name for the HTTP header in the client request that will be matched on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name)
         */
        public fun name(): String

        /** A builder for [HttpRouteHeaderProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            public fun invert(invert: Boolean)

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            public fun invert(invert: IResolvable)

            /** @param match The `HeaderMatchMethod` object. */
            public fun match(match: IResolvable)

            /** @param match The `HeaderMatchMethod` object. */
            public fun match(match: HeaderMatchMethodProperty)

            /** @param match The `HeaderMatchMethod` object. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
            public fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit)

            /**
             * @param name A name for the HTTP header in the client request that will be matched on.
             */
            public fun name(name: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.builder()

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            override fun invert(invert: Boolean) {
                cdkBuilder.invert(invert)
            }

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            override fun invert(invert: IResolvable) {
                cdkBuilder.invert(invert.let(IResolvable::unwrap))
            }

            /** @param match The `HeaderMatchMethod` object. */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /** @param match The `HeaderMatchMethod` object. */
            override fun match(match: HeaderMatchMethodProperty) {
                cdkBuilder.match(match.let(HeaderMatchMethodProperty::unwrap))
            }

            /** @param match The `HeaderMatchMethod` object. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("943aaa4aa398ae17e9d2d5e5753b2fe642ffc59b5354bfa49414263c1115cb7d")
            override fun match(match: HeaderMatchMethodProperty.Builder.() -> Unit): Unit =
                match(HeaderMatchMethodProperty(match))

            /**
             * @param name A name for the HTTP header in the client request that will be matched on.
             */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty,
        ) : HttpRouteHeaderProperty {
            /**
             * Specify `True` to match anything except the match criteria.
             *
             * The default value is `False` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-invert)
             */
            override fun invert(): Any? = unwrap(this).getInvert()

            /**
             * The `HeaderMatchMethod` object.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-match)
             */
            override fun match(): Any? = unwrap(this).getMatch()

            /**
             * A name for the HTTP header in the client request that will be matched on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html#cfn-appmesh-route-httprouteheader-name)
             */
            override fun name(): String = unwrap(this).getName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteHeaderProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty
            ): HttpRouteHeaderProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpRouteHeaderProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HeaderMatchMethodProperty {
        /**
         * The value sent by the client must match the specified value exactly.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-exact)
         */
        public fun exact(): String? = unwrap(this).getExact()

        /**
         * The value sent by the client must begin with the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-prefix)
         */
        public fun prefix(): String? = unwrap(this).getPrefix()

        /**
         * An object that represents the range of values to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-range)
         */
        public fun range(): Any? = unwrap(this).getRange()

        /**
         * The value sent by the client must include the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-regex)
         */
        public fun regex(): String? = unwrap(this).getRegex()

        /**
         * The value sent by the client must end with the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-suffix)
         */
        public fun suffix(): String? = unwrap(this).getSuffix()

        /** A builder for [HeaderMatchMethodProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param exact The value sent by the client must match the specified value exactly. */
            public fun exact(exact: String)

            /**
             * @param prefix The value sent by the client must begin with the specified characters.
             */
            public fun prefix(prefix: String)

            /** @param range An object that represents the range of values to match on. */
            public fun range(range: IResolvable)

            /** @param range An object that represents the range of values to match on. */
            public fun range(range: MatchRangeProperty)

            /** @param range An object that represents the range of values to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
            public fun range(range: MatchRangeProperty.Builder.() -> Unit)

            /** @param regex The value sent by the client must include the specified characters. */
            public fun regex(regex: String)

            /**
             * @param suffix The value sent by the client must end with the specified characters.
             */
            public fun suffix(suffix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.builder()

            /** @param exact The value sent by the client must match the specified value exactly. */
            override fun exact(exact: String) {
                cdkBuilder.exact(exact)
            }

            /**
             * @param prefix The value sent by the client must begin with the specified characters.
             */
            override fun prefix(prefix: String) {
                cdkBuilder.prefix(prefix)
            }

            /** @param range An object that represents the range of values to match on. */
            override fun range(range: IResolvable) {
                cdkBuilder.range(range.let(IResolvable::unwrap))
            }

            /** @param range An object that represents the range of values to match on. */
            override fun range(range: MatchRangeProperty) {
                cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
            }

            /** @param range An object that represents the range of values to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f1f7c2815286fff09a13306072604d8f0b4e9cefb087fb765e2f32673f2ebc31")
            override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
                range(MatchRangeProperty(range))

            /** @param regex The value sent by the client must include the specified characters. */
            override fun regex(regex: String) {
                cdkBuilder.regex(regex)
            }

            /**
             * @param suffix The value sent by the client must end with the specified characters.
             */
            override fun suffix(suffix: String) {
                cdkBuilder.suffix(suffix)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty,
        ) : HeaderMatchMethodProperty {
            /**
             * The value sent by the client must match the specified value exactly.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-exact)
             */
            override fun exact(): String? = unwrap(this).getExact()

            /**
             * The value sent by the client must begin with the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-prefix)
             */
            override fun prefix(): String? = unwrap(this).getPrefix()

            /**
             * An object that represents the range of values to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-range)
             */
            override fun range(): Any? = unwrap(this).getRange()

            /**
             * The value sent by the client must include the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-regex)
             */
            override fun regex(): String? = unwrap(this).getRegex()

            /**
             * The value sent by the client must end with the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html#cfn-appmesh-route-headermatchmethod-suffix)
             */
            override fun suffix(): String? = unwrap(this).getSuffix()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchMethodProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty
            ): HeaderMatchMethodProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HeaderMatchMethodProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpRetryPolicyProperty {
        /**
         * Specify at least one of the following values.
         * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510,
         *   and 511
         * * *gateway-error* – HTTP status codes 502, 503, and 504
         * * *client-error* – HTTP status code 409
         * * *stream-error* – Retry on refused stream
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-httpretryevents)
         */
        public fun httpRetryEvents(): List<String> =
            unwrap(this).getHttpRetryEvents() ?: emptyList()

        /**
         * The maximum number of retry attempts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-maxretries)
         */
        public fun maxRetries(): Number

        /**
         * The timeout for each retry attempt.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-perretrytimeout)
         */
        public fun perRetryTimeout(): Any

        /**
         * Specify a valid value.
         *
         * The event occurs before any processing of a request has started and is encountered when
         * the upstream is temporarily or permanently unavailable.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-tcpretryevents)
         */
        public fun tcpRetryEvents(): List<String> = unwrap(this).getTcpRetryEvents() ?: emptyList()

        /** A builder for [HttpRetryPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            public fun httpRetryEvents(httpRetryEvents: List<String>)

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            public fun httpRetryEvents(vararg httpRetryEvents: String)

            /** @param maxRetries The maximum number of retry attempts. */
            public fun maxRetries(maxRetries: Number)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            public fun perRetryTimeout(perRetryTimeout: IResolvable)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            public fun perRetryTimeout(perRetryTimeout: DurationProperty)

            /** @param perRetryTimeout The timeout for each retry attempt. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
            public fun perRetryTimeout(perRetryTimeout: DurationProperty.Builder.() -> Unit)

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            public fun tcpRetryEvents(tcpRetryEvents: List<String>)

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            public fun tcpRetryEvents(vararg tcpRetryEvents: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.builder()

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            override fun httpRetryEvents(httpRetryEvents: List<String>) {
                cdkBuilder.httpRetryEvents(httpRetryEvents)
            }

            /**
             * @param httpRetryEvents Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             */
            override fun httpRetryEvents(vararg httpRetryEvents: String): Unit =
                httpRetryEvents(httpRetryEvents.toList())

            /** @param maxRetries The maximum number of retry attempts. */
            override fun maxRetries(maxRetries: Number) {
                cdkBuilder.maxRetries(maxRetries)
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            override fun perRetryTimeout(perRetryTimeout: IResolvable) {
                cdkBuilder.perRetryTimeout(perRetryTimeout.let(IResolvable::unwrap))
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            override fun perRetryTimeout(perRetryTimeout: DurationProperty) {
                cdkBuilder.perRetryTimeout(perRetryTimeout.let(DurationProperty::unwrap))
            }

            /** @param perRetryTimeout The timeout for each retry attempt. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("784c51a336be1296c387c22042f53a53c7d5122591c957b70ed9fd13eb1ca12a")
            override fun perRetryTimeout(
                perRetryTimeout: DurationProperty.Builder.() -> Unit
            ): Unit = perRetryTimeout(DurationProperty(perRetryTimeout))

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            override fun tcpRetryEvents(tcpRetryEvents: List<String>) {
                cdkBuilder.tcpRetryEvents(tcpRetryEvents)
            }

            /**
             * @param tcpRetryEvents Specify a valid value. The event occurs before any processing
             *   of a request has started and is encountered when the upstream is temporarily or
             *   permanently unavailable.
             */
            override fun tcpRetryEvents(vararg tcpRetryEvents: String): Unit =
                tcpRetryEvents(tcpRetryEvents.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty,
        ) : HttpRetryPolicyProperty {
            /**
             * Specify at least one of the following values.
             * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508,
             *   510, and 511
             * * *gateway-error* – HTTP status codes 502, 503, and 504
             * * *client-error* – HTTP status code 409
             * * *stream-error* – Retry on refused stream
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-httpretryevents)
             */
            override fun httpRetryEvents(): List<String> =
                unwrap(this).getHttpRetryEvents() ?: emptyList()

            /**
             * The maximum number of retry attempts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-maxretries)
             */
            override fun maxRetries(): Number = unwrap(this).getMaxRetries()

            /**
             * The timeout for each retry attempt.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-perretrytimeout)
             */
            override fun perRetryTimeout(): Any = unwrap(this).getPerRetryTimeout()

            /**
             * Specify a valid value.
             *
             * The event occurs before any processing of a request has started and is encountered
             * when the upstream is temporarily or permanently unavailable.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html#cfn-appmesh-route-httpretrypolicy-tcpretryevents)
             */
            override fun tcpRetryEvents(): List<String> =
                unwrap(this).getTcpRetryEvents() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpRetryPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty
            ): HttpRetryPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpRetryPolicyProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRouteMetadataMatchMethodProperty {
        /**
         * The value sent by the client must match the specified value exactly.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact)
         */
        public fun exact(): String? = unwrap(this).getExact()

        /**
         * The value sent by the client must begin with the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix)
         */
        public fun prefix(): String? = unwrap(this).getPrefix()

        /**
         * An object that represents the range of values to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-range)
         */
        public fun range(): Any? = unwrap(this).getRange()

        /**
         * The value sent by the client must include the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex)
         */
        public fun regex(): String? = unwrap(this).getRegex()

        /**
         * The value sent by the client must end with the specified characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix)
         */
        public fun suffix(): String? = unwrap(this).getSuffix()

        /** A builder for [GrpcRouteMetadataMatchMethodProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param exact The value sent by the client must match the specified value exactly. */
            public fun exact(exact: String)

            /**
             * @param prefix The value sent by the client must begin with the specified characters.
             */
            public fun prefix(prefix: String)

            /** @param range An object that represents the range of values to match on. */
            public fun range(range: IResolvable)

            /** @param range An object that represents the range of values to match on. */
            public fun range(range: MatchRangeProperty)

            /** @param range An object that represents the range of values to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
            public fun range(range: MatchRangeProperty.Builder.() -> Unit)

            /** @param regex The value sent by the client must include the specified characters. */
            public fun regex(regex: String)

            /**
             * @param suffix The value sent by the client must end with the specified characters.
             */
            public fun suffix(suffix: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute
                    .GrpcRouteMetadataMatchMethodProperty
                    .builder()

            /** @param exact The value sent by the client must match the specified value exactly. */
            override fun exact(exact: String) {
                cdkBuilder.exact(exact)
            }

            /**
             * @param prefix The value sent by the client must begin with the specified characters.
             */
            override fun prefix(prefix: String) {
                cdkBuilder.prefix(prefix)
            }

            /** @param range An object that represents the range of values to match on. */
            override fun range(range: IResolvable) {
                cdkBuilder.range(range.let(IResolvable::unwrap))
            }

            /** @param range An object that represents the range of values to match on. */
            override fun range(range: MatchRangeProperty) {
                cdkBuilder.range(range.let(MatchRangeProperty::unwrap))
            }

            /** @param range An object that represents the range of values to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("618ca50b7f60d9a6e27b7d7af0585371cbc8ac043e9f2cea2692993a2ab5c8b9")
            override fun range(range: MatchRangeProperty.Builder.() -> Unit): Unit =
                range(MatchRangeProperty(range))

            /** @param regex The value sent by the client must include the specified characters. */
            override fun regex(regex: String) {
                cdkBuilder.regex(regex)
            }

            /**
             * @param suffix The value sent by the client must end with the specified characters.
             */
            override fun suffix(suffix: String) {
                cdkBuilder.suffix(suffix)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty,
        ) : GrpcRouteMetadataMatchMethodProperty {
            /**
             * The value sent by the client must match the specified value exactly.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-exact)
             */
            override fun exact(): String? = unwrap(this).getExact()

            /**
             * The value sent by the client must begin with the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-prefix)
             */
            override fun prefix(): String? = unwrap(this).getPrefix()

            /**
             * An object that represents the range of values to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-range)
             */
            override fun range(): Any? = unwrap(this).getRange()

            /**
             * The value sent by the client must include the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-regex)
             */
            override fun regex(): String? = unwrap(this).getRegex()

            /**
             * The value sent by the client must end with the specified characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html#cfn-appmesh-route-grpcroutemetadatamatchmethod-suffix)
             */
            override fun suffix(): String? = unwrap(this).getSuffix()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): GrpcRouteMetadataMatchMethodProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty
            ): GrpcRouteMetadataMatchMethodProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRouteMetadataMatchMethodProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface WeightedTargetProperty {
        /**
         * The targeted port of the weighted object.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-port)
         */
        public fun port(): Number? = unwrap(this).getPort()

        /**
         * The virtual node to associate with the weighted target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode)
         */
        public fun virtualNode(): String

        /**
         * The relative weight of the weighted target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight)
         */
        public fun weight(): Number

        /** A builder for [WeightedTargetProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param port The targeted port of the weighted object. */
            public fun port(port: Number)

            /** @param virtualNode The virtual node to associate with the weighted target. */
            public fun virtualNode(virtualNode: String)

            /** @param weight The relative weight of the weighted target. */
            public fun weight(weight: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty.builder()

            /** @param port The targeted port of the weighted object. */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            /** @param virtualNode The virtual node to associate with the weighted target. */
            override fun virtualNode(virtualNode: String) {
                cdkBuilder.virtualNode(virtualNode)
            }

            /** @param weight The relative weight of the weighted target. */
            override fun weight(weight: Number) {
                cdkBuilder.weight(weight)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty,
        ) : WeightedTargetProperty {
            /**
             * The targeted port of the weighted object.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-port)
             */
            override fun port(): Number? = unwrap(this).getPort()

            /**
             * The virtual node to associate with the weighted target.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-virtualnode)
             */
            override fun virtualNode(): String = unwrap(this).getVirtualNode()

            /**
             * The relative weight of the weighted target.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html#cfn-appmesh-route-weightedtarget-weight)
             */
            override fun weight(): Number = unwrap(this).getWeight()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty
            ): WeightedTargetProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: WeightedTargetProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.WeightedTargetProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface QueryParameterProperty {
        /**
         * The query parameter to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-match)
         */
        public fun match(): Any? = unwrap(this).getMatch()

        /**
         * A name for the query parameter that will be matched on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-name)
         */
        public fun name(): String

        /** A builder for [QueryParameterProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param match The query parameter to match on. */
            public fun match(match: IResolvable)

            /** @param match The query parameter to match on. */
            public fun match(match: HttpQueryParameterMatchProperty)

            /** @param match The query parameter to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
            public fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit)

            /** @param name A name for the query parameter that will be matched on. */
            public fun name(name: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.builder()

            /** @param match The query parameter to match on. */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /** @param match The query parameter to match on. */
            override fun match(match: HttpQueryParameterMatchProperty) {
                cdkBuilder.match(match.let(HttpQueryParameterMatchProperty::unwrap))
            }

            /** @param match The query parameter to match on. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("54a474d5592f6d7ce5e6ea7ce9c611ebed2dd706b95c36442ae3dd2c5865ea5d")
            override fun match(match: HttpQueryParameterMatchProperty.Builder.() -> Unit): Unit =
                match(HttpQueryParameterMatchProperty(match))

            /** @param name A name for the query parameter that will be matched on. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty,
        ) : QueryParameterProperty {
            /**
             * The query parameter to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-match)
             */
            override fun match(): Any? = unwrap(this).getMatch()

            /**
             * A name for the query parameter that will be matched on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html#cfn-appmesh-route-queryparameter-name)
             */
            override fun name(): String = unwrap(this).getName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty
            ): QueryParameterProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: QueryParameterProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpRouteProperty {
        /**
         * An object that represents the action to take if a match is determined.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-action)
         */
        public fun action(): Any

        /**
         * An object that represents the criteria for determining a request match.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-match)
         */
        public fun match(): Any

        /**
         * An object that represents a retry policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-retrypolicy)
         */
        public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

        /**
         * An object that represents types of timeouts.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-timeout)
         */
        public fun timeout(): Any? = unwrap(this).getTimeout()

        /** A builder for [HttpRouteProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            public fun action(action: IResolvable)

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            public fun action(action: HttpRouteActionProperty)

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
            public fun action(action: HttpRouteActionProperty.Builder.() -> Unit)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: IResolvable)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            public fun match(match: HttpRouteMatchProperty)

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
            public fun match(match: HttpRouteMatchProperty.Builder.() -> Unit)

            /** @param retryPolicy An object that represents a retry policy. */
            public fun retryPolicy(retryPolicy: IResolvable)

            /** @param retryPolicy An object that represents a retry policy. */
            public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty)

            /** @param retryPolicy An object that represents a retry policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
            public fun retryPolicy(retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: IResolvable)

            /** @param timeout An object that represents types of timeouts. */
            public fun timeout(timeout: HttpTimeoutProperty)

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
            public fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.builder()

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            override fun action(action: IResolvable) {
                cdkBuilder.action(action.let(IResolvable::unwrap))
            }

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            override fun action(action: HttpRouteActionProperty) {
                cdkBuilder.action(action.let(HttpRouteActionProperty::unwrap))
            }

            /**
             * @param action An object that represents the action to take if a match is determined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8dfd294369a3aa58c38d45ef30d12b4e4343acb29bd29d257a3991b2f675feab")
            override fun action(action: HttpRouteActionProperty.Builder.() -> Unit): Unit =
                action(HttpRouteActionProperty(action))

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            override fun match(match: HttpRouteMatchProperty) {
                cdkBuilder.match(match.let(HttpRouteMatchProperty::unwrap))
            }

            /**
             * @param match An object that represents the criteria for determining a request match.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8af0e70e5cbd57e3fea91410cadfaf6f8d85e0f422b840d2a93900146a2b327a")
            override fun match(match: HttpRouteMatchProperty.Builder.() -> Unit): Unit =
                match(HttpRouteMatchProperty(match))

            /** @param retryPolicy An object that represents a retry policy. */
            override fun retryPolicy(retryPolicy: IResolvable) {
                cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
            }

            /** @param retryPolicy An object that represents a retry policy. */
            override fun retryPolicy(retryPolicy: HttpRetryPolicyProperty) {
                cdkBuilder.retryPolicy(retryPolicy.let(HttpRetryPolicyProperty::unwrap))
            }

            /** @param retryPolicy An object that represents a retry policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2ccf4635c876a872e5a0297bfa9b4a5781a8a090451a691fe9d1bc3883b4f790")
            override fun retryPolicy(
                retryPolicy: HttpRetryPolicyProperty.Builder.() -> Unit
            ): Unit = retryPolicy(HttpRetryPolicyProperty(retryPolicy))

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: IResolvable) {
                cdkBuilder.timeout(timeout.let(IResolvable::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            override fun timeout(timeout: HttpTimeoutProperty) {
                cdkBuilder.timeout(timeout.let(HttpTimeoutProperty::unwrap))
            }

            /** @param timeout An object that represents types of timeouts. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6794853ce597e6d6113e7169abe7272f9423ca3b3d195a0d98848bf77a32fd9c")
            override fun timeout(timeout: HttpTimeoutProperty.Builder.() -> Unit): Unit =
                timeout(HttpTimeoutProperty(timeout))

            public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty,
        ) : HttpRouteProperty {
            /**
             * An object that represents the action to take if a match is determined.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-action)
             */
            override fun action(): Any = unwrap(this).getAction()

            /**
             * An object that represents the criteria for determining a request match.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-match)
             */
            override fun match(): Any = unwrap(this).getMatch()

            /**
             * An object that represents a retry policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-retrypolicy)
             */
            override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

            /**
             * An object that represents types of timeouts.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html#cfn-appmesh-route-httproute-timeout)
             */
            override fun timeout(): Any? = unwrap(this).getTimeout()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty
            ): HttpRouteProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpRouteProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRouteMetadataProperty {
        /**
         * Specify `True` to match anything except the match criteria.
         *
         * The default value is `False` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert)
         */
        public fun invert(): Any? = unwrap(this).getInvert()

        /**
         * An object that represents the data to match from the request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-match)
         */
        public fun match(): Any? = unwrap(this).getMatch()

        /**
         * The name of the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name)
         */
        public fun name(): String

        /** A builder for [GrpcRouteMetadataProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            public fun invert(invert: Boolean)

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            public fun invert(invert: IResolvable)

            /** @param match An object that represents the data to match from the request. */
            public fun match(match: IResolvable)

            /** @param match An object that represents the data to match from the request. */
            public fun match(match: GrpcRouteMetadataMatchMethodProperty)

            /** @param match An object that represents the data to match from the request. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
            public fun match(match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit)

            /** @param name The name of the route. */
            public fun name(name: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.builder()

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            override fun invert(invert: Boolean) {
                cdkBuilder.invert(invert)
            }

            /**
             * @param invert Specify `True` to match anything except the match criteria. The default
             *   value is `False` .
             */
            override fun invert(invert: IResolvable) {
                cdkBuilder.invert(invert.let(IResolvable::unwrap))
            }

            /** @param match An object that represents the data to match from the request. */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /** @param match An object that represents the data to match from the request. */
            override fun match(match: GrpcRouteMetadataMatchMethodProperty) {
                cdkBuilder.match(match.let(GrpcRouteMetadataMatchMethodProperty::unwrap))
            }

            /** @param match An object that represents the data to match from the request. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d36445f7b17779f42c1279fbfb47636c8e19441c8a5da343ec1a77f719f5d7b6")
            override fun match(
                match: GrpcRouteMetadataMatchMethodProperty.Builder.() -> Unit
            ): Unit = match(GrpcRouteMetadataMatchMethodProperty(match))

            /** @param name The name of the route. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty,
        ) : GrpcRouteMetadataProperty {
            /**
             * Specify `True` to match anything except the match criteria.
             *
             * The default value is `False` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-invert)
             */
            override fun invert(): Any? = unwrap(this).getInvert()

            /**
             * An object that represents the data to match from the request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-match)
             */
            override fun match(): Any? = unwrap(this).getMatch()

            /**
             * The name of the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html#cfn-appmesh-route-grpcroutemetadata-name)
             */
            override fun name(): String = unwrap(this).getName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMetadataProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty
            ): GrpcRouteMetadataProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRouteMetadataProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface GrpcRouteMatchProperty {
        /**
         * An object that represents the data to match from the request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata)
         */
        public fun metadata(): Any? = unwrap(this).getMetadata()

        /**
         * The method name to match from the request.
         *
         * If you specify a name, you must also specify a `serviceName` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname)
         */
        public fun methodName(): String? = unwrap(this).getMethodName()

        /**
         * The port number to match on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-port)
         */
        public fun port(): Number? = unwrap(this).getPort()

        /**
         * The fully qualified domain name for the service to match from the request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename)
         */
        public fun serviceName(): String? = unwrap(this).getServiceName()

        /** A builder for [GrpcRouteMatchProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param metadata An object that represents the data to match from the request. */
            public fun metadata(metadata: IResolvable)

            /** @param metadata An object that represents the data to match from the request. */
            public fun metadata(metadata: List<Any>)

            /** @param metadata An object that represents the data to match from the request. */
            public fun metadata(vararg metadata: Any)

            /**
             * @param methodName The method name to match from the request. If you specify a name,
             *   you must also specify a `serviceName` .
             */
            public fun methodName(methodName: String)

            /** @param port The port number to match on. */
            public fun port(port: Number)

            /**
             * @param serviceName The fully qualified domain name for the service to match from the
             *   request.
             */
            public fun serviceName(serviceName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.builder()

            /** @param metadata An object that represents the data to match from the request. */
            override fun metadata(metadata: IResolvable) {
                cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
            }

            /** @param metadata An object that represents the data to match from the request. */
            override fun metadata(metadata: List<Any>) {
                cdkBuilder.metadata(metadata)
            }

            /** @param metadata An object that represents the data to match from the request. */
            override fun metadata(vararg metadata: Any): Unit = metadata(metadata.toList())

            /**
             * @param methodName The method name to match from the request. If you specify a name,
             *   you must also specify a `serviceName` .
             */
            override fun methodName(methodName: String) {
                cdkBuilder.methodName(methodName)
            }

            /** @param port The port number to match on. */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            /**
             * @param serviceName The fully qualified domain name for the service to match from the
             *   request.
             */
            override fun serviceName(serviceName: String) {
                cdkBuilder.serviceName(serviceName)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty,
        ) : GrpcRouteMatchProperty {
            /**
             * An object that represents the data to match from the request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-metadata)
             */
            override fun metadata(): Any? = unwrap(this).getMetadata()

            /**
             * The method name to match from the request.
             *
             * If you specify a name, you must also specify a `serviceName` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-methodname)
             */
            override fun methodName(): String? = unwrap(this).getMethodName()

            /**
             * The port number to match on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-port)
             */
            override fun port(): Number? = unwrap(this).getPort()

            /**
             * The fully qualified domain name for the service to match from the request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html#cfn-appmesh-route-grpcroutematch-servicename)
             */
            override fun serviceName(): String? = unwrap(this).getServiceName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMatchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty
            ): GrpcRouteMatchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: GrpcRouteMatchProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DurationProperty {
        /**
         * A unit of time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-unit)
         */
        public fun unit(): String

        /**
         * A number of time units.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-value)
         */
        public fun `value`(): Number

        /** A builder for [DurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param unit A unit of time. */
            public fun unit(unit: String)

            /** @param value A number of time units. */
            public fun `value`(`value`: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.builder()

            /** @param unit A unit of time. */
            override fun unit(unit: String) {
                cdkBuilder.unit(unit)
            }

            /** @param value A number of time units. */
            override fun `value`(`value`: Number) {
                cdkBuilder.`value`(`value`)
            }

            public fun build(): software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty,
        ) : DurationProperty {
            /**
             * A unit of time.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-unit)
             */
            override fun unit(): String = unwrap(this).getUnit()

            /**
             * A number of time units.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html#cfn-appmesh-route-duration-value)
             */
            override fun `value`(): Number = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty
            ): DurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DurationProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HttpTimeoutProperty {
        /**
         * An object that represents an idle timeout.
         *
         * An idle timeout bounds the amount of time that a connection may be idle. The default
         * value is none.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-idle)
         */
        public fun idle(): Any? = unwrap(this).getIdle()

        /**
         * An object that represents a per request timeout.
         *
         * The default value is 15 seconds. If you set a higher timeout, then make sure that the
         * higher value is set for each App Mesh resource in a conversation. For example, if a
         * virtual node backend uses a virtual router provider to route to another virtual node,
         * then the timeout should be greater than 15 seconds for the source and destination virtual
         * node and the route.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-perrequest)
         */
        public fun perRequest(): Any? = unwrap(this).getPerRequest()

        /** A builder for [HttpTimeoutProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: IResolvable)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            public fun idle(idle: DurationProperty)

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
            public fun idle(idle: DurationProperty.Builder.() -> Unit)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            public fun perRequest(perRequest: IResolvable)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            public fun perRequest(perRequest: DurationProperty)

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
            public fun perRequest(perRequest: DurationProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.builder()

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: IResolvable) {
                cdkBuilder.idle(idle.let(IResolvable::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            override fun idle(idle: DurationProperty) {
                cdkBuilder.idle(idle.let(DurationProperty::unwrap))
            }

            /**
             * @param idle An object that represents an idle timeout. An idle timeout bounds the
             *   amount of time that a connection may be idle. The default value is none.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a80d6568c352c41a46becbc98cc29bd3837834a9c9855733dfd66bea9b834c26")
            override fun idle(idle: DurationProperty.Builder.() -> Unit): Unit =
                idle(DurationProperty(idle))

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            override fun perRequest(perRequest: IResolvable) {
                cdkBuilder.perRequest(perRequest.let(IResolvable::unwrap))
            }

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            override fun perRequest(perRequest: DurationProperty) {
                cdkBuilder.perRequest(perRequest.let(DurationProperty::unwrap))
            }

            /**
             * @param perRequest An object that represents a per request timeout. The default value
             *   is 15 seconds. If you set a higher timeout, then make sure that the higher value is
             *   set for each App Mesh resource in a conversation. For example, if a virtual node
             *   backend uses a virtual router provider to route to another virtual node, then the
             *   timeout should be greater than 15 seconds for the source and destination virtual
             *   node and the route.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b83625a5d9cf26bfa8eece30847253209f9ca0475c29c3aa07ea94eab8463445")
            override fun perRequest(perRequest: DurationProperty.Builder.() -> Unit): Unit =
                perRequest(DurationProperty(perRequest))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty,
        ) : HttpTimeoutProperty {
            /**
             * An object that represents an idle timeout.
             *
             * An idle timeout bounds the amount of time that a connection may be idle. The default
             * value is none.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-idle)
             */
            override fun idle(): Any? = unwrap(this).getIdle()

            /**
             * An object that represents a per request timeout.
             *
             * The default value is 15 seconds. If you set a higher timeout, then make sure that the
             * higher value is set for each App Mesh resource in a conversation. For example, if a
             * virtual node backend uses a virtual router provider to route to another virtual node,
             * then the timeout should be greater than 15 seconds for the source and destination
             * virtual node and the route.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html#cfn-appmesh-route-httptimeout-perrequest)
             */
            override fun perRequest(): Any? = unwrap(this).getPerRequest()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeoutProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty
            ): HttpTimeoutProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HttpTimeoutProperty
            ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}

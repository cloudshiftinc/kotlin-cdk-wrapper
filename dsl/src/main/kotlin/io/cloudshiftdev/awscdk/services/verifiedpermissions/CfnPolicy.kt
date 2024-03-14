package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy,
) : CfnResource(cdkObject), IInspectable {
    /** The unique ID of the new or updated policy. */
    public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

    /**
     * The type of the policy. This is one of the following values:.
     * * Static
     * * TemplateLinked
     */
    public open fun attrPolicyType(): String = unwrap(this).getAttrPolicyType()

    /** Specifies the policy type and content to use for the new or updated policy. */
    public open fun definition(): Any = unwrap(this).getDefinition()

    /** Specifies the policy type and content to use for the new or updated policy. */
    public open fun definition(`value`: IResolvable) {
        unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
    }

    /** Specifies the policy type and content to use for the new or updated policy. */
    public open fun definition(`value`: PolicyDefinitionProperty) {
        unwrap(this).setDefinition(`value`.let(PolicyDefinitionProperty::unwrap))
    }

    /** Specifies the policy type and content to use for the new or updated policy. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("217949eba4ab7e89fb3c391dcf44e95990dd14c26a65a561ae4f864717c44c86")
    public open fun definition(`value`: PolicyDefinitionProperty.Builder.() -> Unit): Unit =
        definition(PolicyDefinitionProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Specifies the `PolicyStoreId` of the policy store you want to store the policy in. */
    public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

    /** Specifies the `PolicyStoreId` of the policy store you want to store the policy in. */
    public open fun policyStoreId(`value`: String) {
        unwrap(this).setPolicyStoreId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.verifiedpermissions.CfnPolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        public fun definition(definition: IResolvable)

        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        public fun definition(definition: PolicyDefinitionProperty)

        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3ea4691c0030d18bdd406f2aa7aaf58de05c225848067ef8788e2fa2478b4c26")
        public fun definition(definition: PolicyDefinitionProperty.Builder.() -> Unit)

        /**
         * Specifies the `PolicyStoreId` of the policy store you want to store the policy in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-policystoreid)
         *
         * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store
         *   the policy in.
         */
        public fun policyStoreId(policyStoreId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.Builder =
            software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.Builder.create(scope, id)

        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        override fun definition(definition: IResolvable) {
            cdkBuilder.definition(definition.let(IResolvable::unwrap))
        }

        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        override fun definition(definition: PolicyDefinitionProperty) {
            cdkBuilder.definition(definition.let(PolicyDefinitionProperty::unwrap))
        }

        /**
         * Specifies the policy type and content to use for the new or updated policy.
         *
         * The definition structure must include either a `Static` or a `TemplateLinked` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-definition)
         *
         * @param definition Specifies the policy type and content to use for the new or updated
         *   policy.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3ea4691c0030d18bdd406f2aa7aaf58de05c225848067ef8788e2fa2478b4c26")
        override fun definition(definition: PolicyDefinitionProperty.Builder.() -> Unit): Unit =
            definition(PolicyDefinitionProperty(definition))

        /**
         * Specifies the `PolicyStoreId` of the policy store you want to store the policy in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html#cfn-verifiedpermissions-policy-policystoreid)
         *
         * @param policyStoreId Specifies the `PolicyStoreId` of the policy store you want to store
         *   the policy in.
         */
        override fun policyStoreId(policyStoreId: String) {
            cdkBuilder.policyStoreId(policyStoreId)
        }

        public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
        ): CfnPolicy = CfnPolicy(cdkObject)

        internal fun unwrap(
            wrapped: CfnPolicy
        ): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy = wrapped.cdkObject
    }

    public interface EntityIdentifierProperty {
        /**
         * The identifier of an entity.
         *
         * `"entityId":" *identifier* "`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html#cfn-verifiedpermissions-policy-entityidentifier-entityid)
         */
        public fun entityId(): String

        /**
         * The type of an entity.
         *
         * Example: `"entityType":" *typeName* "`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html#cfn-verifiedpermissions-policy-entityidentifier-entitytype)
         */
        public fun entityType(): String

        /** A builder for [EntityIdentifierProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param entityId The identifier of an entity. `"entityId":" *identifier* "` */
            public fun entityId(entityId: String)

            /** @param entityType The type of an entity. Example: `"entityType":" *typeName* "` */
            public fun entityType(entityType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty.Builder =
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
                    .EntityIdentifierProperty
                    .builder()

            /** @param entityId The identifier of an entity. `"entityId":" *identifier* "` */
            override fun entityId(entityId: String) {
                cdkBuilder.entityId(entityId)
            }

            /** @param entityType The type of an entity. Example: `"entityType":" *typeName* "` */
            override fun entityType(entityType: String) {
                cdkBuilder.entityType(entityType)
            }

            public fun build():
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty,
        ) : EntityIdentifierProperty {
            /**
             * The identifier of an entity.
             *
             * `"entityId":" *identifier* "`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html#cfn-verifiedpermissions-policy-entityidentifier-entityid)
             */
            override fun entityId(): String = unwrap(this).getEntityId()

            /**
             * The type of an entity.
             *
             * Example: `"entityType":" *typeName* "`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html#cfn-verifiedpermissions-policy-entityidentifier-entitytype)
             */
            override fun entityType(): String = unwrap(this).getEntityType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EntityIdentifierProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty
            ): EntityIdentifierProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EntityIdentifierProperty
            ): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.EntityIdentifierProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TemplateLinkedPolicyDefinitionProperty {
        /**
         * The unique identifier of the policy template used to create this policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-policytemplateid)
         */
        public fun policyTemplateId(): String

        /**
         * The principal associated with this template-linked policy.
         *
         * Verified Permissions substitutes this principal for the `?principal` placeholder in the
         * policy template when it evaluates an authorization request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-principal)
         */
        public fun principal(): Any? = unwrap(this).getPrincipal()

        /**
         * The resource associated with this template-linked policy.
         *
         * Verified Permissions substitutes this resource for the `?resource` placeholder in the
         * policy template when it evaluates an authorization request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-resource)
         */
        public fun resource(): Any? = unwrap(this).getResource()

        /** A builder for [TemplateLinkedPolicyDefinitionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param policyTemplateId The unique identifier of the policy template used to create
             *   this policy.
             */
            public fun policyTemplateId(policyTemplateId: String)

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            public fun principal(principal: IResolvable)

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            public fun principal(principal: EntityIdentifierProperty)

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("67af872f3f0bc32f6df7215695742092a4a64cbc5d28d7feeef3fbf8af4e79e3")
            public fun principal(principal: EntityIdentifierProperty.Builder.() -> Unit)

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            public fun resource(resource: IResolvable)

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            public fun resource(resource: EntityIdentifierProperty)

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e8c256e86965bf2090b3c5083cfd2a4aaa89d6ed2903965890cdf312bf85198f")
            public fun resource(resource: EntityIdentifierProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty.Builder =
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
                    .TemplateLinkedPolicyDefinitionProperty
                    .builder()

            /**
             * @param policyTemplateId The unique identifier of the policy template used to create
             *   this policy.
             */
            override fun policyTemplateId(policyTemplateId: String) {
                cdkBuilder.policyTemplateId(policyTemplateId)
            }

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            override fun principal(principal: IResolvable) {
                cdkBuilder.principal(principal.let(IResolvable::unwrap))
            }

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            override fun principal(principal: EntityIdentifierProperty) {
                cdkBuilder.principal(principal.let(EntityIdentifierProperty::unwrap))
            }

            /**
             * @param principal The principal associated with this template-linked policy. Verified
             *   Permissions substitutes this principal for the `?principal` placeholder in the
             *   policy template when it evaluates an authorization request.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("67af872f3f0bc32f6df7215695742092a4a64cbc5d28d7feeef3fbf8af4e79e3")
            override fun principal(principal: EntityIdentifierProperty.Builder.() -> Unit): Unit =
                principal(EntityIdentifierProperty(principal))

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            override fun resource(resource: IResolvable) {
                cdkBuilder.resource(resource.let(IResolvable::unwrap))
            }

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            override fun resource(resource: EntityIdentifierProperty) {
                cdkBuilder.resource(resource.let(EntityIdentifierProperty::unwrap))
            }

            /**
             * @param resource The resource associated with this template-linked policy. Verified
             *   Permissions substitutes this resource for the `?resource` placeholder in the policy
             *   template when it evaluates an authorization request.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e8c256e86965bf2090b3c5083cfd2a4aaa89d6ed2903965890cdf312bf85198f")
            override fun resource(resource: EntityIdentifierProperty.Builder.() -> Unit): Unit =
                resource(EntityIdentifierProperty(resource))

            public fun build():
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty,
        ) : TemplateLinkedPolicyDefinitionProperty {
            /**
             * The unique identifier of the policy template used to create this policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-policytemplateid)
             */
            override fun policyTemplateId(): String = unwrap(this).getPolicyTemplateId()

            /**
             * The principal associated with this template-linked policy.
             *
             * Verified Permissions substitutes this principal for the `?principal` placeholder in
             * the policy template when it evaluates an authorization request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-principal)
             */
            override fun principal(): Any? = unwrap(this).getPrincipal()

            /**
             * The resource associated with this template-linked policy.
             *
             * Verified Permissions substitutes this resource for the `?resource` placeholder in the
             * policy template when it evaluates an authorization request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html#cfn-verifiedpermissions-policy-templatelinkedpolicydefinition-resource)
             */
            override fun resource(): Any? = unwrap(this).getResource()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TemplateLinkedPolicyDefinitionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty
            ): TemplateLinkedPolicyDefinitionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TemplateLinkedPolicyDefinitionProperty
            ): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.TemplateLinkedPolicyDefinitionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PolicyDefinitionProperty {
        /**
         * A structure that describes a static policy.
         *
         * An static policy doesn't use a template or allow placeholders for entities.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html#cfn-verifiedpermissions-policy-policydefinition-static)
         */
        public fun staticValue(): Any? = unwrap(this).getStaticValue()

        /**
         * A structure that describes a policy that was instantiated from a template.
         *
         * The template can specify placeholders for `principal` and `resource` . When you use
         * [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
         * to create a policy from a template, you specify the exact principal and resource to use
         * for the instantiated policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html#cfn-verifiedpermissions-policy-policydefinition-templatelinked)
         */
        public fun templateLinked(): Any? = unwrap(this).getTemplateLinked()

        /** A builder for [PolicyDefinitionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            public fun staticValue(staticValue: IResolvable)

            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            public fun staticValue(staticValue: StaticPolicyDefinitionProperty)

            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("829766e17a9d57f1d489148df1cab457cd52463198ba25d2339133671ee383cf")
            public fun staticValue(staticValue: StaticPolicyDefinitionProperty.Builder.() -> Unit)

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            public fun templateLinked(templateLinked: IResolvable)

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            public fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty)

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3958378f5ac72ae87a7e6ab0e6ce35cae9c67a619ac0c0ffee1ac07364a6d64f")
            public fun templateLinked(
                templateLinked: TemplateLinkedPolicyDefinitionProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty.Builder =
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
                    .PolicyDefinitionProperty
                    .builder()

            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            override fun staticValue(staticValue: IResolvable) {
                cdkBuilder.staticValue(staticValue.let(IResolvable::unwrap))
            }

            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            override fun staticValue(staticValue: StaticPolicyDefinitionProperty) {
                cdkBuilder.staticValue(staticValue.let(StaticPolicyDefinitionProperty::unwrap))
            }

            /**
             * @param staticValue A structure that describes a static policy. An static policy
             *   doesn't use a template or allow placeholders for entities.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("829766e17a9d57f1d489148df1cab457cd52463198ba25d2339133671ee383cf")
            override fun staticValue(
                staticValue: StaticPolicyDefinitionProperty.Builder.() -> Unit
            ): Unit = staticValue(StaticPolicyDefinitionProperty(staticValue))

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            override fun templateLinked(templateLinked: IResolvable) {
                cdkBuilder.templateLinked(templateLinked.let(IResolvable::unwrap))
            }

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            override fun templateLinked(templateLinked: TemplateLinkedPolicyDefinitionProperty) {
                cdkBuilder.templateLinked(
                    templateLinked.let(TemplateLinkedPolicyDefinitionProperty::unwrap)
                )
            }

            /**
             * @param templateLinked A structure that describes a policy that was instantiated from
             *   a template. The template can specify placeholders for `principal` and `resource` .
             *   When you use
             *   [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             *   to create a policy from a template, you specify the exact principal and resource to
             *   use for the instantiated policy.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3958378f5ac72ae87a7e6ab0e6ce35cae9c67a619ac0c0ffee1ac07364a6d64f")
            override fun templateLinked(
                templateLinked: TemplateLinkedPolicyDefinitionProperty.Builder.() -> Unit
            ): Unit = templateLinked(TemplateLinkedPolicyDefinitionProperty(templateLinked))

            public fun build():
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty,
        ) : PolicyDefinitionProperty {
            /**
             * A structure that describes a static policy.
             *
             * An static policy doesn't use a template or allow placeholders for entities.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html#cfn-verifiedpermissions-policy-policydefinition-static)
             */
            override fun staticValue(): Any? = unwrap(this).getStaticValue()

            /**
             * A structure that describes a policy that was instantiated from a template.
             *
             * The template can specify placeholders for `principal` and `resource` . When you use
             * [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
             * to create a policy from a template, you specify the exact principal and resource to
             * use for the instantiated policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html#cfn-verifiedpermissions-policy-policydefinition-templatelinked)
             */
            override fun templateLinked(): Any? = unwrap(this).getTemplateLinked()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDefinitionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty
            ): PolicyDefinitionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PolicyDefinitionProperty
            ): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.PolicyDefinitionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StaticPolicyDefinitionProperty {
        /**
         * The description of the static policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html#cfn-verifiedpermissions-policy-staticpolicydefinition-description)
         */
        public fun description(): String? = unwrap(this).getDescription()

        /**
         * The policy content of the static policy, written in the Cedar policy language.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html#cfn-verifiedpermissions-policy-staticpolicydefinition-statement)
         */
        public fun statement(): String

        /** A builder for [StaticPolicyDefinitionProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param description The description of the static policy. */
            public fun description(description: String)

            /**
             * @param statement The policy content of the static policy, written in the Cedar policy
             *   language.
             */
            public fun statement(statement: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty.Builder =
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
                    .StaticPolicyDefinitionProperty
                    .builder()

            /** @param description The description of the static policy. */
            override fun description(description: String) {
                cdkBuilder.description(description)
            }

            /**
             * @param statement The policy content of the static policy, written in the Cedar policy
             *   language.
             */
            override fun statement(statement: String) {
                cdkBuilder.statement(statement)
            }

            public fun build():
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty,
        ) : StaticPolicyDefinitionProperty {
            /**
             * The description of the static policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html#cfn-verifiedpermissions-policy-staticpolicydefinition-description)
             */
            override fun description(): String? = unwrap(this).getDescription()

            /**
             * The policy content of the static policy, written in the Cedar policy language.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html#cfn-verifiedpermissions-policy-staticpolicydefinition-statement)
             */
            override fun statement(): String = unwrap(this).getStatement()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): StaticPolicyDefinitionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty
            ): StaticPolicyDefinitionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StaticPolicyDefinitionProperty
            ): software.amazon.awscdk.services.verifiedpermissions.CfnPolicy.StaticPolicyDefinitionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}

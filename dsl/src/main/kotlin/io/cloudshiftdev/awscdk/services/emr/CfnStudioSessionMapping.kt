package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStudioSessionMapping
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMapping,
) : CfnResource(cdkObject), IInspectable {
    /** The name of the user or group. */
    public open fun identityName(): String = unwrap(this).getIdentityName()

    /** The name of the user or group. */
    public open fun identityName(`value`: String) {
        unwrap(this).setIdentityName(`value`)
    }

    /** Specifies whether the identity to map to the Amazon EMR Studio is a user or a group. */
    public open fun identityType(): String = unwrap(this).getIdentityType()

    /** Specifies whether the identity to map to the Amazon EMR Studio is a user or a group. */
    public open fun identityType(`value`: String) {
        unwrap(this).setIdentityType(`value`)
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
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
     * group.
     */
    public open fun sessionPolicyArn(): String = unwrap(this).getSessionPolicyArn()

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
     * group.
     */
    public open fun sessionPolicyArn(`value`: String) {
        unwrap(this).setSessionPolicyArn(`value`)
    }

    /** The ID of the Amazon EMR Studio to which the user or group will be mapped. */
    public open fun studioId(): String = unwrap(this).getStudioId()

    /** The ID of the Amazon EMR Studio to which the user or group will be mapped. */
    public open fun studioId(`value`: String) {
        unwrap(this).setStudioId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnStudioSessionMapping]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the user or group.
         *
         * For more information, see
         * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
         * and
         * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
         * in the *IAM Identity Center Identity Store API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identityname)
         *
         * @param identityName The name of the user or group.
         */
        public fun identityName(identityName: String)

        /**
         * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identitytype)
         *
         * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a
         *   user or a group.
         */
        public fun identityType(identityType: String)

        /**
         * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
         * group.
         *
         * Session policies refine Studio user permissions without the need to use multiple IAM user
         * roles. For more information, see
         * [Create an EMR Studio user role with session policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html)
         * in the *Amazon EMR Management Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-sessionpolicyarn)
         *
         * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will
         *   be applied to the user or group.
         */
        public fun sessionPolicyArn(sessionPolicyArn: String)

        /**
         * The ID of the Amazon EMR Studio to which the user or group will be mapped.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-studioid)
         *
         * @param studioId The ID of the Amazon EMR Studio to which the user or group will be
         *   mapped.
         */
        public fun studioId(studioId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder =
            software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder.create(scope, id)

        /**
         * The name of the user or group.
         *
         * For more information, see
         * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
         * and
         * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
         * in the *IAM Identity Center Identity Store API Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identityname)
         *
         * @param identityName The name of the user or group.
         */
        override fun identityName(identityName: String) {
            cdkBuilder.identityName(identityName)
        }

        /**
         * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-identitytype)
         *
         * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a
         *   user or a group.
         */
        override fun identityType(identityType: String) {
            cdkBuilder.identityType(identityType)
        }

        /**
         * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or
         * group.
         *
         * Session policies refine Studio user permissions without the need to use multiple IAM user
         * roles. For more information, see
         * [Create an EMR Studio user role with session policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html)
         * in the *Amazon EMR Management Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-sessionpolicyarn)
         *
         * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will
         *   be applied to the user or group.
         */
        override fun sessionPolicyArn(sessionPolicyArn: String) {
            cdkBuilder.sessionPolicyArn(sessionPolicyArn)
        }

        /**
         * The ID of the Amazon EMR Studio to which the user or group will be mapped.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studiosessionmapping.html#cfn-emr-studiosessionmapping-studioid)
         *
         * @param studioId The ID of the Amazon EMR Studio to which the user or group will be
         *   mapped.
         */
        override fun studioId(studioId: String) {
            cdkBuilder.studioId(studioId)
        }

        public fun build(): software.amazon.awscdk.services.emr.CfnStudioSessionMapping =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStudioSessionMapping {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStudioSessionMapping(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMapping
        ): CfnStudioSessionMapping = CfnStudioSessionMapping(cdkObject)

        internal fun unwrap(
            wrapped: CfnStudioSessionMapping
        ): software.amazon.awscdk.services.emr.CfnStudioSessionMapping = wrapped.cdkObject
    }
}

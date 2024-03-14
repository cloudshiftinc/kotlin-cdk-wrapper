package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStackUserAssociation
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociation,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The authentication type for the user who is associated with the stack. */
    public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

    /** The authentication type for the user who is associated with the stack. */
    public open fun authenticationType(`value`: String) {
        unwrap(this).setAuthenticationType(`value`)
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
     * Specifies whether a welcome email is sent to a user after the user is created in the user
     * pool.
     */
    public open fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user
     * pool.
     */
    public open fun sendEmailNotification(`value`: Boolean) {
        unwrap(this).setSendEmailNotification(`value`)
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user
     * pool.
     */
    public open fun sendEmailNotification(`value`: IResolvable) {
        unwrap(this).setSendEmailNotification(`value`.let(IResolvable::unwrap))
    }

    /** The name of the stack that is associated with the user. */
    public open fun stackName(): String = unwrap(this).getStackName()

    /** The name of the stack that is associated with the user. */
    public open fun stackName(`value`: String) {
        unwrap(this).setStackName(`value`)
    }

    /** The email address of the user who is associated with the stack. */
    public open fun userName(): String = unwrap(this).getUserName()

    /** The email address of the user who is associated with the stack. */
    public open fun userName(`value`: String) {
        unwrap(this).setUserName(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnStackUserAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The authentication type for the user who is associated with the stack.
         *
         * You must specify USERPOOL.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype)
         *
         * @param authenticationType The authentication type for the user who is associated with the
         *   stack.
         */
        public fun authenticationType(authenticationType: String)

        /**
         * Specifies whether a welcome email is sent to a user after the user is created in the user
         * pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
         *
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after
         *   the user is created in the user pool.
         */
        public fun sendEmailNotification(sendEmailNotification: Boolean)

        /**
         * Specifies whether a welcome email is sent to a user after the user is created in the user
         * pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
         *
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after
         *   the user is created in the user pool.
         */
        public fun sendEmailNotification(sendEmailNotification: IResolvable)

        /**
         * The name of the stack that is associated with the user.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname)
         *
         * @param stackName The name of the stack that is associated with the user.
         */
        public fun stackName(stackName: String)

        /**
         * The email address of the user who is associated with the stack.
         *
         * Users' email addresses are case-sensitive.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username)
         *
         * @param userName The email address of the user who is associated with the stack.
         */
        public fun userName(userName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder =
            software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder.create(
                scope,
                id
            )

        /**
         * The authentication type for the user who is associated with the stack.
         *
         * You must specify USERPOOL.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype)
         *
         * @param authenticationType The authentication type for the user who is associated with the
         *   stack.
         */
        override fun authenticationType(authenticationType: String) {
            cdkBuilder.authenticationType(authenticationType)
        }

        /**
         * Specifies whether a welcome email is sent to a user after the user is created in the user
         * pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
         *
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after
         *   the user is created in the user pool.
         */
        override fun sendEmailNotification(sendEmailNotification: Boolean) {
            cdkBuilder.sendEmailNotification(sendEmailNotification)
        }

        /**
         * Specifies whether a welcome email is sent to a user after the user is created in the user
         * pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
         *
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after
         *   the user is created in the user pool.
         */
        override fun sendEmailNotification(sendEmailNotification: IResolvable) {
            cdkBuilder.sendEmailNotification(sendEmailNotification.let(IResolvable::unwrap))
        }

        /**
         * The name of the stack that is associated with the user.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname)
         *
         * @param stackName The name of the stack that is associated with the user.
         */
        override fun stackName(stackName: String) {
            cdkBuilder.stackName(stackName)
        }

        /**
         * The email address of the user who is associated with the stack.
         *
         * Users' email addresses are case-sensitive.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username)
         *
         * @param userName The email address of the user who is associated with the stack.
         */
        override fun userName(userName: String) {
            cdkBuilder.userName(userName)
        }

        public fun build(): software.amazon.awscdk.services.appstream.CfnStackUserAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnStackUserAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnStackUserAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociation
        ): CfnStackUserAssociation = CfnStackUserAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnStackUserAssociation
        ): software.amazon.awscdk.services.appstream.CfnStackUserAssociation = wrapped.cdkObject
    }
}

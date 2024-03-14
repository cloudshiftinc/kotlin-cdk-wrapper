package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermission
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.acmpca.CfnPermission,
) : CfnResource(cdkObject), IInspectable {
    /** The private CA actions that can be performed by the designated AWS service. */
    public open fun actions(): List<String> = unwrap(this).getActions()

    /** The private CA actions that can be performed by the designated AWS service. */
    public open fun actions(`value`: List<String>) {
        unwrap(this).setActions(`value`)
    }

    /** The private CA actions that can be performed by the designated AWS service. */
    public open fun actions(vararg `value`: String): Unit = actions(`value`.toList())

    /** The Amazon Resource Number (ARN) of the private CA from which the permission was issued. */
    public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /** The Amazon Resource Number (ARN) of the private CA from which the permission was issued. */
    public open fun certificateAuthorityArn(`value`: String) {
        unwrap(this).setCertificateAuthorityArn(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The AWS service or entity that holds the permission. */
    public open fun principal(): String = unwrap(this).getPrincipal()

    /** The AWS service or entity that holds the permission. */
    public open fun principal(`value`: String) {
        unwrap(this).setPrincipal(`value`)
    }

    /** The ID of the account that assigned the permission. */
    public open fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    /** The ID of the account that assigned the permission. */
    public open fun sourceAccount(`value`: String) {
        unwrap(this).setSourceAccount(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.acmpca.CfnPermission]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The private CA actions that can be performed by the designated AWS service.
         *
         * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
         *
         * @param actions The private CA actions that can be performed by the designated AWS
         *   service.
         */
        public fun actions(actions: List<String>)

        /**
         * The private CA actions that can be performed by the designated AWS service.
         *
         * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
         *
         * @param actions The private CA actions that can be performed by the designated AWS
         *   service.
         */
        public fun actions(vararg actions: String)

        /**
         * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
         *
         * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from
         *   which the permission was issued.
         */
        public fun certificateAuthorityArn(certificateAuthorityArn: String)

        /**
         * The AWS service or entity that holds the permission.
         *
         * At this time, the only valid principal is `acm.amazonaws.com` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
         *
         * @param principal The AWS service or entity that holds the permission.
         */
        public fun principal(principal: String)

        /**
         * The ID of the account that assigned the permission.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
         *
         * @param sourceAccount The ID of the account that assigned the permission.
         */
        public fun sourceAccount(sourceAccount: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnPermission.Builder =
            software.amazon.awscdk.services.acmpca.CfnPermission.Builder.create(scope, id)

        /**
         * The private CA actions that can be performed by the designated AWS service.
         *
         * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
         *
         * @param actions The private CA actions that can be performed by the designated AWS
         *   service.
         */
        override fun actions(actions: List<String>) {
            cdkBuilder.actions(actions)
        }

        /**
         * The private CA actions that can be performed by the designated AWS service.
         *
         * Supported actions are `IssueCertificate` , `GetCertificate` , and `ListPermissions` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-actions)
         *
         * @param actions The private CA actions that can be performed by the designated AWS
         *   service.
         */
        override fun actions(vararg actions: String): Unit = actions(actions.toList())

        /**
         * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-certificateauthorityarn)
         *
         * @param certificateAuthorityArn The Amazon Resource Number (ARN) of the private CA from
         *   which the permission was issued.
         */
        override fun certificateAuthorityArn(certificateAuthorityArn: String) {
            cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
        }

        /**
         * The AWS service or entity that holds the permission.
         *
         * At this time, the only valid principal is `acm.amazonaws.com` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-principal)
         *
         * @param principal The AWS service or entity that holds the permission.
         */
        override fun principal(principal: String) {
            cdkBuilder.principal(principal)
        }

        /**
         * The ID of the account that assigned the permission.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-permission.html#cfn-acmpca-permission-sourceaccount)
         *
         * @param sourceAccount The ID of the account that assigned the permission.
         */
        override fun sourceAccount(sourceAccount: String) {
            cdkBuilder.sourceAccount(sourceAccount)
        }

        public fun build(): software.amazon.awscdk.services.acmpca.CfnPermission =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPermission {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPermission(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.acmpca.CfnPermission
        ): CfnPermission = CfnPermission(cdkObject)

        internal fun unwrap(
            wrapped: CfnPermission
        ): software.amazon.awscdk.services.acmpca.CfnPermission = wrapped.cdkObject
    }
}

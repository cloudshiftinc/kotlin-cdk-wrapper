package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModuleDefaultVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.CfnModuleDefaultVersion,
) : CfnResource(cdkObject), IInspectable {
    /** The Amazon Resource Name (ARN) of the module version to set as the default version. */
    public open fun arn(): String? = unwrap(this).getArn()

    /** The Amazon Resource Name (ARN) of the module version to set as the default version. */
    public open fun arn(`value`: String) {
        unwrap(this).setArn(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the module. */
    public open fun moduleName(): String? = unwrap(this).getModuleName()

    /** The name of the module. */
    public open fun moduleName(`value`: String) {
        unwrap(this).setModuleName(`value`)
    }

    /** The ID for the specific version of the module. */
    public open fun versionId(): String? = unwrap(this).getVersionId()

    /** The ID for the specific version of the module. */
    public open fun versionId(`value`: String) {
        unwrap(this).setVersionId(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.CfnModuleDefaultVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Amazon Resource Name (ARN) of the module version to set as the default version.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
         *
         * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
         *   version.
         */
        public fun arn(arn: String)

        /**
         * The name of the module.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
         *
         * @param moduleName The name of the module.
         */
        public fun moduleName(moduleName: String)

        /**
         * The ID for the specific version of the module.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
         *
         * @param versionId The ID for the specific version of the module.
         */
        public fun versionId(versionId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.CfnModuleDefaultVersion.Builder =
            software.amazon.awscdk.CfnModuleDefaultVersion.Builder.create(scope, id)

        /**
         * The Amazon Resource Name (ARN) of the module version to set as the default version.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
         *
         * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
         *   version.
         */
        override fun arn(arn: String) {
            cdkBuilder.arn(arn)
        }

        /**
         * The name of the module.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
         *
         * @param moduleName The name of the module.
         */
        override fun moduleName(moduleName: String) {
            cdkBuilder.moduleName(moduleName)
        }

        /**
         * The ID for the specific version of the module.
         *
         * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
         *
         * @param versionId The ID for the specific version of the module.
         */
        override fun versionId(versionId: String) {
            cdkBuilder.versionId(versionId)
        }

        public fun build(): software.amazon.awscdk.CfnModuleDefaultVersion = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnModuleDefaultVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnModuleDefaultVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.CfnModuleDefaultVersion
        ): CfnModuleDefaultVersion = CfnModuleDefaultVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnModuleDefaultVersion
        ): software.amazon.awscdk.CfnModuleDefaultVersion = wrapped.cdkObject
    }
}

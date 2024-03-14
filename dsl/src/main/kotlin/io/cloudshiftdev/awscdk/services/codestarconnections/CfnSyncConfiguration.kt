package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSyncConfiguration
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The owner ID for the repository associated with a specific sync configuration, such as the
     * owner ID in GitHub.
     */
    public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

    /** The name of the external provider where your third-party code repository is configured. */
    public open fun attrProviderType(): String = unwrap(this).getAttrProviderType()

    /** The name of the repository that is being synced to. */
    public open fun attrRepositoryName(): String = unwrap(this).getAttrRepositoryName()

    /** The branch associated with a specific sync configuration. */
    public open fun branch(): String = unwrap(this).getBranch()

    /** The branch associated with a specific sync configuration. */
    public open fun branch(`value`: String) {
        unwrap(this).setBranch(`value`)
    }

    /** The file path to the configuration file associated with a specific sync configuration. */
    public open fun configFile(): String = unwrap(this).getConfigFile()

    /** The file path to the configuration file associated with a specific sync configuration. */
    public open fun configFile(`value`: String) {
        unwrap(this).setConfigFile(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the repository link associated with a specific sync configuration. */
    public open fun repositoryLinkId(): String = unwrap(this).getRepositoryLinkId()

    /** The ID of the repository link associated with a specific sync configuration. */
    public open fun repositoryLinkId(`value`: String) {
        unwrap(this).setRepositoryLinkId(`value`)
    }

    /** The name of the connection resource associated with a specific sync configuration. */
    public open fun resourceName(): String = unwrap(this).getResourceName()

    /** The name of the connection resource associated with a specific sync configuration. */
    public open fun resourceName(`value`: String) {
        unwrap(this).setResourceName(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /** The type of sync for a specific sync configuration. */
    public open fun syncType(): String = unwrap(this).getSyncType()

    /** The type of sync for a specific sync configuration. */
    public open fun syncType(`value`: String) {
        unwrap(this).setSyncType(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.codestarconnections.CfnSyncConfiguration].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The branch associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
         *
         * @param branch The branch associated with a specific sync configuration.
         */
        public fun branch(branch: String)

        /**
         * The file path to the configuration file associated with a specific sync configuration.
         *
         * The path should point to an actual file in the sync configurations linked repository.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
         *
         * @param configFile The file path to the configuration file associated with a specific sync
         *   configuration.
         */
        public fun configFile(configFile: String)

        /**
         * The ID of the repository link associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
         *
         * @param repositoryLinkId The ID of the repository link associated with a specific sync
         *   configuration.
         */
        public fun repositoryLinkId(repositoryLinkId: String)

        /**
         * The name of the connection resource associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
         *
         * @param resourceName The name of the connection resource associated with a specific sync
         *   configuration.
         */
        public fun resourceName(resourceName: String)

        /**
         * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific
         *   sync configuration.
         */
        public fun roleArn(roleArn: String)

        /**
         * The type of sync for a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
         *
         * @param syncType The type of sync for a specific sync configuration.
         */
        public fun syncType(syncType: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder =
            software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder.create(
                scope,
                id
            )

        /**
         * The branch associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
         *
         * @param branch The branch associated with a specific sync configuration.
         */
        override fun branch(branch: String) {
            cdkBuilder.branch(branch)
        }

        /**
         * The file path to the configuration file associated with a specific sync configuration.
         *
         * The path should point to an actual file in the sync configurations linked repository.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
         *
         * @param configFile The file path to the configuration file associated with a specific sync
         *   configuration.
         */
        override fun configFile(configFile: String) {
            cdkBuilder.configFile(configFile)
        }

        /**
         * The ID of the repository link associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
         *
         * @param repositoryLinkId The ID of the repository link associated with a specific sync
         *   configuration.
         */
        override fun repositoryLinkId(repositoryLinkId: String) {
            cdkBuilder.repositoryLinkId(repositoryLinkId)
        }

        /**
         * The name of the connection resource associated with a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
         *
         * @param resourceName The name of the connection resource associated with a specific sync
         *   configuration.
         */
        override fun resourceName(resourceName: String) {
            cdkBuilder.resourceName(resourceName)
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
         * configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific
         *   sync configuration.
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The type of sync for a specific sync configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
         *
         * @param syncType The type of sync for a specific sync configuration.
         */
        override fun syncType(syncType: String) {
            cdkBuilder.syncType(syncType)
        }

        public fun build():
            software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnSyncConfiguration {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnSyncConfiguration(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration
        ): CfnSyncConfiguration = CfnSyncConfiguration(cdkObject)

        internal fun unwrap(
            wrapped: CfnSyncConfiguration
        ): software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration =
            wrapped.cdkObject
    }
}

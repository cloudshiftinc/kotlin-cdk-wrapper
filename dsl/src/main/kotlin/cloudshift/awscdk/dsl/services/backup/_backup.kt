@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.backup

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.BackupPlanRuleProps
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.BackupSelection
import software.amazon.awscdk.services.backup.BackupSelectionOptions
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.amazon.awscdk.services.backup.BackupVault
import software.amazon.awscdk.services.backup.BackupVaultProps
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import software.amazon.awscdk.services.backup.CfnBackupVault
import software.amazon.awscdk.services.backup.CfnBackupVaultProps
import software.amazon.awscdk.services.backup.CfnFramework
import software.amazon.awscdk.services.backup.CfnFrameworkProps
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.amazon.awscdk.services.backup.CfnReportPlanProps
import software.amazon.awscdk.services.backup.LockConfiguration
import software.amazon.awscdk.services.backup.TagCondition
import software.constructs.Construct

public object backup {
    /**
     * A backup plan.
     *
     * Example:
     * ```
     * // Daily, weekly and monthly with 5 year retention
     * BackupPlan plan = BackupPlan.dailyWeeklyMonthly5YearRetention(this, "Plan");
     * ```
     */
    public inline fun backupPlan(
        scope: Construct,
        id: String,
        block: BackupPlanDsl.() -> Unit = {},
    ): BackupPlan {
        val builder = BackupPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a BackupPlanCopyAction.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.backup.*;
     * BackupVault backupVault;
     * BackupPlanCopyActionProps backupPlanCopyActionProps = BackupPlanCopyActionProps.builder()
     * .destinationBackupVault(backupVault)
     * // the properties below are optional
     * .deleteAfter(Duration.minutes(30))
     * .moveToColdStorageAfter(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun backupPlanCopyActionProps(
        block: BackupPlanCopyActionPropsDsl.() -> Unit = {}
    ): BackupPlanCopyActionProps {
        val builder = BackupPlanCopyActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a BackupPlan.
     *
     * Example:
     * ```
     * BackupPlan plan = BackupPlan.Builder.create(this, "Plan")
     * .windowsVss(true)
     * .build();
     * ```
     */
    public inline fun backupPlanProps(block: BackupPlanPropsDsl.() -> Unit = {}): BackupPlanProps {
        val builder = BackupPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A backup plan rule.
     *
     * Example:
     * ```
     * BackupPlan plan;
     * plan.addRule(BackupPlanRule.Builder.create()
     * .enableContinuousBackup(true)
     * .deleteAfter(Duration.days(14))
     * .build());
     * ```
     */
    public inline fun backupPlanRule(block: BackupPlanRuleDsl.() -> Unit = {}): BackupPlanRule {
        val builder = BackupPlanRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a BackupPlanRule.
     *
     * Example:
     * ```
     * BackupPlan plan;
     * BackupVault secondaryVault;
     * plan.addRule(BackupPlanRule.Builder.create()
     * .copyActions(List.of(BackupPlanCopyActionProps.builder()
     * .destinationBackupVault(secondaryVault)
     * .moveToColdStorageAfter(Duration.days(30))
     * .deleteAfter(Duration.days(120))
     * .build()))
     * .build());
     * ```
     */
    public inline fun backupPlanRuleProps(
        block: BackupPlanRulePropsDsl.() -> Unit = {}
    ): BackupPlanRuleProps {
        val builder = BackupPlanRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A resource to backup.
     *
     * Example:
     * ```
     * BackupPlan plan;
     * Vpc vpc;
     * ITable myTable = Table.fromTableName(this, "Table", "myTableName");
     * DatabaseInstance myDatabaseInstance = DatabaseInstance.Builder.create(this, "DatabaseInstance")
     * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_26).build()))
     * .vpc(vpc)
     * .build();
     * DatabaseCluster myDatabaseCluster = DatabaseCluster.Builder.create(this, "DatabaseCluster")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
     * .credentials(Credentials.fromGeneratedSecret("clusteradmin"))
     * .instanceProps(InstanceProps.builder()
     * .vpc(vpc)
     * .build())
     * .build();
     * ServerlessCluster myServerlessCluster = ServerlessCluster.Builder.create(this,
     * "ServerlessCluster")
     * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
     * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
     * "default.aurora-postgresql10"))
     * .vpc(vpc)
     * .build();
     * Construct myCoolConstruct = new Construct(this, "MyCoolConstruct");
     * plan.addSelection("Selection", BackupSelectionOptions.builder()
     * .resources(List.of(BackupResource.fromDynamoDbTable(myTable),
     * BackupResource.fromRdsDatabaseInstance(myDatabaseInstance),
     * BackupResource.fromRdsDatabaseCluster(myDatabaseCluster),
     * BackupResource.fromRdsServerlessCluster(myServerlessCluster), BackupResource.fromTag("stage",
     * "prod"), BackupResource.fromConstruct(myCoolConstruct)))
     * .build());
     * ```
     */
    public inline fun backupResource(
        resource: String,
        construct: Construct,
        block: BackupResourceDsl.() -> Unit = {},
    ): BackupResource {
        val builder = BackupResourceDsl(resource, construct)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A backup selection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * import software.amazon.awscdk.services.iam.*;
     * BackupPlan backupPlan;
     * BackupResource backupResource;
     * Role role;
     * BackupSelection backupSelection = BackupSelection.Builder.create(this, "MyBackupSelection")
     * .backupPlan(backupPlan)
     * .resources(List.of(backupResource))
     * // the properties below are optional
     * .allowRestores(false)
     * .backupSelectionName("backupSelectionName")
     * .role(role)
     * .build();
     * ```
     */
    public inline fun backupSelection(
        scope: Construct,
        id: String,
        block: BackupSelectionDsl.() -> Unit = {},
    ): BackupSelection {
        val builder = BackupSelectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a BackupSelection.
     *
     * Example:
     * ```
     * BackupPlan plan;
     * Vpc vpc;
     * ITable myTable = Table.fromTableName(this, "Table", "myTableName");
     * DatabaseInstance myDatabaseInstance = DatabaseInstance.Builder.create(this, "DatabaseInstance")
     * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_26).build()))
     * .vpc(vpc)
     * .build();
     * DatabaseCluster myDatabaseCluster = DatabaseCluster.Builder.create(this, "DatabaseCluster")
     * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
     * .credentials(Credentials.fromGeneratedSecret("clusteradmin"))
     * .instanceProps(InstanceProps.builder()
     * .vpc(vpc)
     * .build())
     * .build();
     * ServerlessCluster myServerlessCluster = ServerlessCluster.Builder.create(this,
     * "ServerlessCluster")
     * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
     * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
     * "default.aurora-postgresql10"))
     * .vpc(vpc)
     * .build();
     * Construct myCoolConstruct = new Construct(this, "MyCoolConstruct");
     * plan.addSelection("Selection", BackupSelectionOptions.builder()
     * .resources(List.of(BackupResource.fromDynamoDbTable(myTable),
     * BackupResource.fromRdsDatabaseInstance(myDatabaseInstance),
     * BackupResource.fromRdsDatabaseCluster(myDatabaseCluster),
     * BackupResource.fromRdsServerlessCluster(myServerlessCluster), BackupResource.fromTag("stage",
     * "prod"), BackupResource.fromConstruct(myCoolConstruct)))
     * .build());
     * ```
     */
    public inline fun backupSelectionOptions(
        block: BackupSelectionOptionsDsl.() -> Unit = {}
    ): BackupSelectionOptions {
        val builder = BackupSelectionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a BackupSelection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * import software.amazon.awscdk.services.iam.*;
     * BackupPlan backupPlan;
     * BackupResource backupResource;
     * Role role;
     * BackupSelectionProps backupSelectionProps = BackupSelectionProps.builder()
     * .backupPlan(backupPlan)
     * .resources(List.of(backupResource))
     * // the properties below are optional
     * .allowRestores(false)
     * .backupSelectionName("backupSelectionName")
     * .role(role)
     * .build();
     * ```
     */
    public inline fun backupSelectionProps(
        block: BackupSelectionPropsDsl.() -> Unit = {}
    ): BackupSelectionProps {
        val builder = BackupSelectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A backup vault.
     *
     * Example:
     * ```
     * IBackupVault importedVault = BackupVault.fromBackupVaultName(this, "Vault", "myVaultName");
     * Role role = Role.Builder.create(this, "Access Role").assumedBy(new
     * ServicePrincipal("lambda.amazonaws.com")).build();
     * importedVault.grant(role, "backup:StartBackupJob");
     * ```
     */
    public inline fun backupVault(
        scope: Construct,
        id: String,
        block: BackupVaultDsl.() -> Unit = {},
    ): BackupVault {
        val builder = BackupVaultDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a BackupVault.
     *
     * Example:
     * ```
     * IKey myKey = Key.fromKeyArn(this, "MyKey", "aaa");
     * ITopic myTopic = Topic.fromTopicArn(this, "MyTopic", "bbb");
     * BackupVault vault = BackupVault.Builder.create(this, "Vault")
     * .encryptionKey(myKey) // Custom encryption key
     * .notificationTopic(myTopic)
     * .build();
     * ```
     */
    public inline fun backupVaultProps(
        block: BackupVaultPropsDsl.() -> Unit = {}
    ): BackupVaultProps {
        val builder = BackupVaultPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains an optional backup plan display name and an array of `BackupRule` objects, each of
     * which specifies a backup rule.
     *
     * Each rule in a backup plan is a separate scheduled task and can back up a different selection
     * of AWS resources.
     *
     * For a sample AWS CloudFormation template, see the
     * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object backupOptions;
     * CfnBackupPlan cfnBackupPlan = CfnBackupPlan.Builder.create(this, "MyCfnBackupPlan")
     * .backupPlan(BackupPlanResourceTypeProperty.builder()
     * .backupPlanName("backupPlanName")
     * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
     * .ruleName("ruleName")
     * .targetBackupVault("targetBackupVault")
     * // the properties below are optional
     * .completionWindowMinutes(123)
     * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
     * .destinationBackupVaultArn("destinationBackupVaultArn")
     * // the properties below are optional
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .build()))
     * .enableContinuousBackup(false)
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .recoveryPointTags(Map.of(
     * "recoveryPointTagsKey", "recoveryPointTags"))
     * .scheduleExpression("scheduleExpression")
     * .startWindowMinutes(123)
     * .build()))
     * // the properties below are optional
     * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
     * .backupOptions(backupOptions)
     * .resourceType("resourceType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .backupPlanTags(Map.of(
     * "backupPlanTagsKey", "backupPlanTags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html)
     */
    public inline fun cfnBackupPlan(
        scope: Construct,
        id: String,
        block: CfnBackupPlanDsl.() -> Unit = {},
    ): CfnBackupPlan {
        val builder = CfnBackupPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing resource type and backup options.
     *
     * This is only supported for Windows VSS backups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object backupOptions;
     * AdvancedBackupSettingResourceTypeProperty advancedBackupSettingResourceTypeProperty =
     * AdvancedBackupSettingResourceTypeProperty.builder()
     * .backupOptions(backupOptions)
     * .resourceType("resourceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-advancedbackupsettingresourcetype.html)
     */
    public inline fun cfnBackupPlanAdvancedBackupSettingResourceTypeProperty(
        block: CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty {
        val builder = CfnBackupPlanAdvancedBackupSettingResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing properties used to create a backup plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object backupOptions;
     * BackupPlanResourceTypeProperty backupPlanResourceTypeProperty =
     * BackupPlanResourceTypeProperty.builder()
     * .backupPlanName("backupPlanName")
     * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
     * .ruleName("ruleName")
     * .targetBackupVault("targetBackupVault")
     * // the properties below are optional
     * .completionWindowMinutes(123)
     * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
     * .destinationBackupVaultArn("destinationBackupVaultArn")
     * // the properties below are optional
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .build()))
     * .enableContinuousBackup(false)
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .recoveryPointTags(Map.of(
     * "recoveryPointTagsKey", "recoveryPointTags"))
     * .scheduleExpression("scheduleExpression")
     * .startWindowMinutes(123)
     * .build()))
     * // the properties below are optional
     * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
     * .backupOptions(backupOptions)
     * .resourceType("resourceType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html)
     */
    public inline fun cfnBackupPlanBackupPlanResourceTypeProperty(
        block: CfnBackupPlanBackupPlanResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupPlan.BackupPlanResourceTypeProperty {
        val builder = CfnBackupPlanBackupPlanResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing properties used to schedule a task to back up a selection of
     * resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * BackupRuleResourceTypeProperty backupRuleResourceTypeProperty =
     * BackupRuleResourceTypeProperty.builder()
     * .ruleName("ruleName")
     * .targetBackupVault("targetBackupVault")
     * // the properties below are optional
     * .completionWindowMinutes(123)
     * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
     * .destinationBackupVaultArn("destinationBackupVaultArn")
     * // the properties below are optional
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .build()))
     * .enableContinuousBackup(false)
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .recoveryPointTags(Map.of(
     * "recoveryPointTagsKey", "recoveryPointTags"))
     * .scheduleExpression("scheduleExpression")
     * .startWindowMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html)
     */
    public inline fun cfnBackupPlanBackupRuleResourceTypeProperty(
        block: CfnBackupPlanBackupRuleResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupPlan.BackupRuleResourceTypeProperty {
        val builder = CfnBackupPlanBackupRuleResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Copies backups created by a backup rule to another vault.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * CopyActionResourceTypeProperty copyActionResourceTypeProperty =
     * CopyActionResourceTypeProperty.builder()
     * .destinationBackupVaultArn("destinationBackupVaultArn")
     * // the properties below are optional
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html)
     */
    public inline fun cfnBackupPlanCopyActionResourceTypeProperty(
        block: CfnBackupPlanCopyActionResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupPlan.CopyActionResourceTypeProperty {
        val builder = CfnBackupPlanCopyActionResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing an array of `Transition` objects that determine how long in
     * days before a recovery point transitions to cold storage or is deleted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * LifecycleResourceTypeProperty lifecycleResourceTypeProperty =
     * LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html)
     */
    public inline fun cfnBackupPlanLifecycleResourceTypeProperty(
        block: CfnBackupPlanLifecycleResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupPlan.LifecycleResourceTypeProperty {
        val builder = CfnBackupPlanLifecycleResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBackupPlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object backupOptions;
     * CfnBackupPlanProps cfnBackupPlanProps = CfnBackupPlanProps.builder()
     * .backupPlan(BackupPlanResourceTypeProperty.builder()
     * .backupPlanName("backupPlanName")
     * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
     * .ruleName("ruleName")
     * .targetBackupVault("targetBackupVault")
     * // the properties below are optional
     * .completionWindowMinutes(123)
     * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
     * .destinationBackupVaultArn("destinationBackupVaultArn")
     * // the properties below are optional
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .build()))
     * .enableContinuousBackup(false)
     * .lifecycle(LifecycleResourceTypeProperty.builder()
     * .deleteAfterDays(123)
     * .moveToColdStorageAfterDays(123)
     * .build())
     * .recoveryPointTags(Map.of(
     * "recoveryPointTagsKey", "recoveryPointTags"))
     * .scheduleExpression("scheduleExpression")
     * .startWindowMinutes(123)
     * .build()))
     * // the properties below are optional
     * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
     * .backupOptions(backupOptions)
     * .resourceType("resourceType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .backupPlanTags(Map.of(
     * "backupPlanTagsKey", "backupPlanTags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html)
     */
    public inline fun cfnBackupPlanProps(
        block: CfnBackupPlanPropsDsl.() -> Unit = {}
    ): CfnBackupPlanProps {
        val builder = CfnBackupPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a set of resources to assign to a backup plan.
     *
     * For a sample AWS CloudFormation template, see the
     * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object conditions;
     * CfnBackupSelection cfnBackupSelection = CfnBackupSelection.Builder.create(this,
     * "MyCfnBackupSelection")
     * .backupPlanId("backupPlanId")
     * .backupSelection(BackupSelectionResourceTypeProperty.builder()
     * .iamRoleArn("iamRoleArn")
     * .selectionName("selectionName")
     * // the properties below are optional
     * .conditions(conditions)
     * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionType("conditionType")
     * .conditionValue("conditionValue")
     * .build()))
     * .notResources(List.of("notResources"))
     * .resources(List.of("resources"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html)
     */
    public inline fun cfnBackupSelection(
        scope: Construct,
        id: String,
        block: CfnBackupSelectionDsl.() -> Unit = {},
    ): CfnBackupSelection {
        val builder = CfnBackupSelectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing properties used to assign a set of resources to a backup plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object conditions;
     * BackupSelectionResourceTypeProperty backupSelectionResourceTypeProperty =
     * BackupSelectionResourceTypeProperty.builder()
     * .iamRoleArn("iamRoleArn")
     * .selectionName("selectionName")
     * // the properties below are optional
     * .conditions(conditions)
     * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionType("conditionType")
     * .conditionValue("conditionValue")
     * .build()))
     * .notResources(List.of("notResources"))
     * .resources(List.of("resources"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html)
     */
    public inline fun cfnBackupSelectionBackupSelectionResourceTypeProperty(
        block: CfnBackupSelectionBackupSelectionResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupSelection.BackupSelectionResourceTypeProperty {
        val builder = CfnBackupSelectionBackupSelectionResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Includes information about tags you define to assign tagged resources to a backup plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ConditionParameterProperty conditionParameterProperty = ConditionParameterProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionValue("conditionValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html)
     */
    public inline fun cfnBackupSelectionConditionParameterProperty(
        block: CfnBackupSelectionConditionParameterPropertyDsl.() -> Unit = {}
    ): CfnBackupSelection.ConditionParameterProperty {
        val builder = CfnBackupSelectionConditionParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object that contains an array of triplets made up of a condition type (such as
     * `STRINGEQUALS` ), a key, and a value.
     *
     * Conditions are used to filter resources in a selection that is assigned to a backup plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ConditionResourceTypeProperty conditionResourceTypeProperty =
     * ConditionResourceTypeProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionType("conditionType")
     * .conditionValue("conditionValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html)
     */
    public inline fun cfnBackupSelectionConditionResourceTypeProperty(
        block: CfnBackupSelectionConditionResourceTypePropertyDsl.() -> Unit = {}
    ): CfnBackupSelection.ConditionResourceTypeProperty {
        val builder = CfnBackupSelectionConditionResourceTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about which resources to include or exclude from a backup plan using
     * their tags.
     *
     * Conditions are case sensitive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ConditionsProperty conditionsProperty = ConditionsProperty.builder()
     * .stringEquals(List.of(ConditionParameterProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionValue("conditionValue")
     * .build()))
     * .stringLike(List.of(ConditionParameterProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionValue("conditionValue")
     * .build()))
     * .stringNotEquals(List.of(ConditionParameterProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionValue("conditionValue")
     * .build()))
     * .stringNotLike(List.of(ConditionParameterProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionValue("conditionValue")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditions.html)
     */
    public inline fun cfnBackupSelectionConditionsProperty(
        block: CfnBackupSelectionConditionsPropertyDsl.() -> Unit = {}
    ): CfnBackupSelection.ConditionsProperty {
        val builder = CfnBackupSelectionConditionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBackupSelection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object conditions;
     * CfnBackupSelectionProps cfnBackupSelectionProps = CfnBackupSelectionProps.builder()
     * .backupPlanId("backupPlanId")
     * .backupSelection(BackupSelectionResourceTypeProperty.builder()
     * .iamRoleArn("iamRoleArn")
     * .selectionName("selectionName")
     * // the properties below are optional
     * .conditions(conditions)
     * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
     * .conditionKey("conditionKey")
     * .conditionType("conditionType")
     * .conditionValue("conditionValue")
     * .build()))
     * .notResources(List.of("notResources"))
     * .resources(List.of("resources"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html)
     */
    public inline fun cfnBackupSelectionProps(
        block: CfnBackupSelectionPropsDsl.() -> Unit = {}
    ): CfnBackupSelectionProps {
        val builder = CfnBackupSelectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a logical container where backups are stored.
     *
     * A `CreateBackupVault` request includes a name, optionally one or more resource tags, an
     * encryption key, and a request ID.
     *
     * Do not include sensitive data, such as passport numbers, in the name of a backup vault.
     *
     * For a sample AWS CloudFormation template, see the
     * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object accessPolicy;
     * CfnBackupVault cfnBackupVault = CfnBackupVault.Builder.create(this, "MyCfnBackupVault")
     * .backupVaultName("backupVaultName")
     * // the properties below are optional
     * .accessPolicy(accessPolicy)
     * .backupVaultTags(Map.of(
     * "backupVaultTagsKey", "backupVaultTags"))
     * .encryptionKeyArn("encryptionKeyArn")
     * .lockConfiguration(LockConfigurationTypeProperty.builder()
     * .minRetentionDays(123)
     * // the properties below are optional
     * .changeableForDays(123)
     * .maxRetentionDays(123)
     * .build())
     * .notifications(NotificationObjectTypeProperty.builder()
     * .backupVaultEvents(List.of("backupVaultEvents"))
     * .snsTopicArn("snsTopicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html)
     */
    public inline fun cfnBackupVault(
        scope: Construct,
        id: String,
        block: CfnBackupVaultDsl.() -> Unit = {},
    ): CfnBackupVault {
        val builder = CfnBackupVaultDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LockConfigurationType` property type specifies configuration for
     * [AWS Backup Vault Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * LockConfigurationTypeProperty lockConfigurationTypeProperty =
     * LockConfigurationTypeProperty.builder()
     * .minRetentionDays(123)
     * // the properties below are optional
     * .changeableForDays(123)
     * .maxRetentionDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-lockconfigurationtype.html)
     */
    public inline fun cfnBackupVaultLockConfigurationTypeProperty(
        block: CfnBackupVaultLockConfigurationTypePropertyDsl.() -> Unit = {}
    ): CfnBackupVault.LockConfigurationTypeProperty {
        val builder = CfnBackupVaultLockConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an object containing SNS event notification properties for the target backup vault.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * NotificationObjectTypeProperty notificationObjectTypeProperty =
     * NotificationObjectTypeProperty.builder()
     * .backupVaultEvents(List.of("backupVaultEvents"))
     * .snsTopicArn("snsTopicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html)
     */
    public inline fun cfnBackupVaultNotificationObjectTypeProperty(
        block: CfnBackupVaultNotificationObjectTypePropertyDsl.() -> Unit = {}
    ): CfnBackupVault.NotificationObjectTypeProperty {
        val builder = CfnBackupVaultNotificationObjectTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBackupVault`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object accessPolicy;
     * CfnBackupVaultProps cfnBackupVaultProps = CfnBackupVaultProps.builder()
     * .backupVaultName("backupVaultName")
     * // the properties below are optional
     * .accessPolicy(accessPolicy)
     * .backupVaultTags(Map.of(
     * "backupVaultTagsKey", "backupVaultTags"))
     * .encryptionKeyArn("encryptionKeyArn")
     * .lockConfiguration(LockConfigurationTypeProperty.builder()
     * .minRetentionDays(123)
     * // the properties below are optional
     * .changeableForDays(123)
     * .maxRetentionDays(123)
     * .build())
     * .notifications(NotificationObjectTypeProperty.builder()
     * .backupVaultEvents(List.of("backupVaultEvents"))
     * .snsTopicArn("snsTopicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html)
     */
    public inline fun cfnBackupVaultProps(
        block: CfnBackupVaultPropsDsl.() -> Unit = {}
    ): CfnBackupVaultProps {
        val builder = CfnBackupVaultPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a framework with one or more controls.
     *
     * A framework is a collection of controls that you can use to evaluate your backup practices.
     * By using pre-built customizable controls to define your policies, you can evaluate whether
     * your backup practices comply with your policies and which resources are not yet in
     * compliance.
     *
     * For a sample AWS CloudFormation template, see the
     * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/bam-cfn-integration.html#bam-cfn-frameworks-template)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object controlScope;
     * CfnFramework cfnFramework = CfnFramework.Builder.create(this, "MyCfnFramework")
     * .frameworkControls(List.of(FrameworkControlProperty.builder()
     * .controlName("controlName")
     * // the properties below are optional
     * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .controlScope(controlScope)
     * .build()))
     * // the properties below are optional
     * .frameworkDescription("frameworkDescription")
     * .frameworkName("frameworkName")
     * .frameworkTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
     */
    public inline fun cfnFramework(
        scope: Construct,
        id: String,
        block: CfnFrameworkDsl.() -> Unit = {},
    ): CfnFramework {
        val builder = CfnFrameworkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of parameters for a control.
     *
     * A control can have zero, one, or more than one parameter. An example of a control with two
     * parameters is: "backup plan frequency is at least `daily` and the retention period is at
     * least `1 year` ". The first parameter is `daily` . The second parameter is `1 year` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ControlInputParameterProperty controlInputParameterProperty =
     * ControlInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html)
     */
    public inline fun cfnFrameworkControlInputParameterProperty(
        block: CfnFrameworkControlInputParameterPropertyDsl.() -> Unit = {}
    ): CfnFramework.ControlInputParameterProperty {
        val builder = CfnFrameworkControlInputParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A framework consists of one or more controls.
     *
     * Each control has its own control scope. The control scope can include one or more resource
     * types, a combination of a tag key and value, or a combination of one resource type and one
     * resource ID. If no scope is specified, evaluations for the rule are triggered when any
     * resource in your recording group changes in configuration.
     *
     * To set a control scope that includes all of a particular resource, leave the `ControlScope`
     * empty or do not pass it when calling `CreateFramework` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ControlScopeProperty controlScopeProperty = ControlScopeProperty.builder()
     * .complianceResourceIds(List.of("complianceResourceIds"))
     * .complianceResourceTypes(List.of("complianceResourceTypes"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlscope.html)
     */
    public inline fun cfnFrameworkControlScopeProperty(
        block: CfnFrameworkControlScopePropertyDsl.() -> Unit = {}
    ): CfnFramework.ControlScopeProperty {
        val builder = CfnFrameworkControlScopePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object controlScope;
     * FrameworkControlProperty frameworkControlProperty = FrameworkControlProperty.builder()
     * .controlName("controlName")
     * // the properties below are optional
     * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .controlScope(controlScope)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html)
     */
    public inline fun cfnFrameworkFrameworkControlProperty(
        block: CfnFrameworkFrameworkControlPropertyDsl.() -> Unit = {}
    ): CfnFramework.FrameworkControlProperty {
        val builder = CfnFrameworkFrameworkControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFramework`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object controlScope;
     * CfnFrameworkProps cfnFrameworkProps = CfnFrameworkProps.builder()
     * .frameworkControls(List.of(FrameworkControlProperty.builder()
     * .controlName("controlName")
     * // the properties below are optional
     * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .controlScope(controlScope)
     * .build()))
     * // the properties below are optional
     * .frameworkDescription("frameworkDescription")
     * .frameworkName("frameworkName")
     * .frameworkTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
     */
    public inline fun cfnFrameworkProps(
        block: CfnFrameworkPropsDsl.() -> Unit = {}
    ): CfnFrameworkProps {
        val builder = CfnFrameworkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a report plan.
     *
     * A report plan is a document that contains information about the contents of the report and
     * where AWS Backup will deliver it.
     *
     * If you call `CreateReportPlan` with a plan that already exists, you receive an
     * `AlreadyExistsException` exception.
     *
     * For a sample AWS CloudFormation template, see the
     * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object reportDeliveryChannel;
     * Object reportSetting;
     * CfnReportPlan cfnReportPlan = CfnReportPlan.Builder.create(this, "MyCfnReportPlan")
     * .reportDeliveryChannel(reportDeliveryChannel)
     * .reportSetting(reportSetting)
     * // the properties below are optional
     * .reportPlanDescription("reportPlanDescription")
     * .reportPlanName("reportPlanName")
     * .reportPlanTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html)
     */
    public inline fun cfnReportPlan(
        scope: Construct,
        id: String,
        block: CfnReportPlanDsl.() -> Unit = {},
    ): CfnReportPlan {
        val builder = CfnReportPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReportPlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * Object reportDeliveryChannel;
     * Object reportSetting;
     * CfnReportPlanProps cfnReportPlanProps = CfnReportPlanProps.builder()
     * .reportDeliveryChannel(reportDeliveryChannel)
     * .reportSetting(reportSetting)
     * // the properties below are optional
     * .reportPlanDescription("reportPlanDescription")
     * .reportPlanName("reportPlanName")
     * .reportPlanTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html)
     */
    public inline fun cfnReportPlanProps(
        block: CfnReportPlanPropsDsl.() -> Unit = {}
    ): CfnReportPlanProps {
        val builder = CfnReportPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information from your report plan about where to deliver your reports, specifically
     * your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ReportDeliveryChannelProperty reportDeliveryChannelProperty =
     * ReportDeliveryChannelProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .formats(List.of("formats"))
     * .s3KeyPrefix("s3KeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html)
     */
    public inline fun cfnReportPlanReportDeliveryChannelProperty(
        block: CfnReportPlanReportDeliveryChannelPropertyDsl.() -> Unit = {}
    ): CfnReportPlan.ReportDeliveryChannelProperty {
        val builder = CfnReportPlanReportDeliveryChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains detailed information about a report setting.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * ReportSettingProperty reportSettingProperty = ReportSettingProperty.builder()
     * .reportTemplate("reportTemplate")
     * // the properties below are optional
     * .accounts(List.of("accounts"))
     * .frameworkArns(List.of("frameworkArns"))
     * .organizationUnits(List.of("organizationUnits"))
     * .regions(List.of("regions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html)
     */
    public inline fun cfnReportPlanReportSettingProperty(
        block: CfnReportPlanReportSettingPropertyDsl.() -> Unit = {}
    ): CfnReportPlan.ReportSettingProperty {
        val builder = CfnReportPlanReportSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for AWS Backup Vault Lock.
     *
     * Example:
     * ```
     * BackupVault.Builder.create(this, "Vault")
     * .lockConfiguration(LockConfiguration.builder()
     * .minRetention(Duration.days(30))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/vault-lock.html)
     */
    public inline fun lockConfiguration(
        block: LockConfigurationDsl.() -> Unit = {}
    ): LockConfiguration {
        val builder = LockConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A tag condition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backup.*;
     * TagCondition tagCondition = TagCondition.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .operation(TagOperation.STRING_EQUALS)
     * .build();
     * ```
     */
    public inline fun tagCondition(block: TagConditionDsl.() -> Unit = {}): TagCondition {
        val builder = TagConditionDsl()
        builder.apply(block)
        return builder.build()
    }
}

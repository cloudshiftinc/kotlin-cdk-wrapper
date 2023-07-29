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

package cloudshift.awscdk.dsl.services.secretsmanager

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import software.amazon.awscdk.services.secretsmanager.SecretAttributes
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions
import software.constructs.Construct

public object secretsmanager {
    /**
     * Options to add a secret attachment to a secret.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * ISecretAttachmentTarget secretAttachmentTarget;
     * AttachedSecretOptions attachedSecretOptions = AttachedSecretOptions.builder()
     * .target(secretAttachmentTarget)
     * .build();
     * ```
     */
    public inline fun attachedSecretOptions(
        block: AttachedSecretOptionsDsl.() -> Unit = {}
    ): AttachedSecretOptions {
        val builder = AttachedSecretOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attaches a resource-based permission policy to a secret.
     *
     * A resource-based policy is optional. For more information, see
     * [Authentication and access control for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html)
     *
     * For information about attaching a policy in the console, see
     * [Attach a permissions policy to a secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html)
     * .
     *
     * *Required permissions:* `secretsmanager:PutResourcePolicy` . For more information, see
     * [IAM policy actions for Secrets Manager](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awssecretsmanager.html#awssecretsmanager-actions-as-permissions)
     * and
     * [Authentication and access control in Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Object resourcePolicy;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .resourcePolicy(resourcePolicy)
     * .secretId("secretId")
     * // the properties below are optional
     * .blockPublicPolicy(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourcePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Object resourcePolicy;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .resourcePolicy(resourcePolicy)
     * .secretId("secretId")
     * // the properties below are optional
     * .blockPublicPolicy(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets the rotation schedule and Lambda rotation function for a secret. For more information,
     * see
     * [How rotation works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
     * .
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * For the rotation function, you have two options:
     * * You can create a new rotation function based on one of the
     *   [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     *   by using `HostedRotationLambda` .
     * * You can choose an existing rotation function by using `RotationLambdaARN` .
     *
     * For database secrets, if you define both the secret and the database or service in the AWS
     * CloudFormation template, then you need to define the
     * [AWS::SecretsManager::SecretTargetAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
     * resource to populate the secret with the connection details of the database or service before
     * you attempt to configure rotation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnRotationSchedule cfnRotationSchedule = CfnRotationSchedule.Builder.create(this,
     * "MyCfnRotationSchedule")
     * .secretId("secretId")
     * // the properties below are optional
     * .hostedRotationLambda(HostedRotationLambdaProperty.builder()
     * .rotationType("rotationType")
     * // the properties below are optional
     * .excludeCharacters("excludeCharacters")
     * .kmsKeyArn("kmsKeyArn")
     * .masterSecretArn("masterSecretArn")
     * .masterSecretKmsKeyArn("masterSecretKmsKeyArn")
     * .rotationLambdaName("rotationLambdaName")
     * .runtime("runtime")
     * .superuserSecretArn("superuserSecretArn")
     * .superuserSecretKmsKeyArn("superuserSecretKmsKeyArn")
     * .vpcSecurityGroupIds("vpcSecurityGroupIds")
     * .vpcSubnetIds("vpcSubnetIds")
     * .build())
     * .rotateImmediatelyOnUpdate(false)
     * .rotationLambdaArn("rotationLambdaArn")
     * .rotationRules(RotationRulesProperty.builder()
     * .automaticallyAfterDays(123)
     * .duration("duration")
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html)
     */
    public inline fun cfnRotationSchedule(
        scope: Construct,
        id: String,
        block: CfnRotationScheduleDsl.() -> Unit = {},
    ): CfnRotationSchedule {
        val builder = CfnRotationScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * .
     *
     * You must specify `Transform: AWS::SecretsManager-2020-07-23` at the beginning of the
     * CloudFormation template.
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * HostedRotationLambdaProperty hostedRotationLambdaProperty =
     * HostedRotationLambdaProperty.builder()
     * .rotationType("rotationType")
     * // the properties below are optional
     * .excludeCharacters("excludeCharacters")
     * .kmsKeyArn("kmsKeyArn")
     * .masterSecretArn("masterSecretArn")
     * .masterSecretKmsKeyArn("masterSecretKmsKeyArn")
     * .rotationLambdaName("rotationLambdaName")
     * .runtime("runtime")
     * .superuserSecretArn("superuserSecretArn")
     * .superuserSecretKmsKeyArn("superuserSecretKmsKeyArn")
     * .vpcSecurityGroupIds("vpcSecurityGroupIds")
     * .vpcSubnetIds("vpcSubnetIds")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html)
     */
    public inline fun cfnRotationScheduleHostedRotationLambdaProperty(
        block: CfnRotationScheduleHostedRotationLambdaPropertyDsl.() -> Unit = {}
    ): CfnRotationSchedule.HostedRotationLambdaProperty {
        val builder = CfnRotationScheduleHostedRotationLambdaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRotationSchedule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnRotationScheduleProps cfnRotationScheduleProps = CfnRotationScheduleProps.builder()
     * .secretId("secretId")
     * // the properties below are optional
     * .hostedRotationLambda(HostedRotationLambdaProperty.builder()
     * .rotationType("rotationType")
     * // the properties below are optional
     * .excludeCharacters("excludeCharacters")
     * .kmsKeyArn("kmsKeyArn")
     * .masterSecretArn("masterSecretArn")
     * .masterSecretKmsKeyArn("masterSecretKmsKeyArn")
     * .rotationLambdaName("rotationLambdaName")
     * .runtime("runtime")
     * .superuserSecretArn("superuserSecretArn")
     * .superuserSecretKmsKeyArn("superuserSecretKmsKeyArn")
     * .vpcSecurityGroupIds("vpcSecurityGroupIds")
     * .vpcSubnetIds("vpcSubnetIds")
     * .build())
     * .rotateImmediatelyOnUpdate(false)
     * .rotationLambdaArn("rotationLambdaArn")
     * .rotationRules(RotationRulesProperty.builder()
     * .automaticallyAfterDays(123)
     * .duration("duration")
     * .scheduleExpression("scheduleExpression")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html)
     */
    public inline fun cfnRotationScheduleProps(
        block: CfnRotationSchedulePropsDsl.() -> Unit = {}
    ): CfnRotationScheduleProps {
        val builder = CfnRotationSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The rotation schedule and window.
     *
     * We recommend you use `ScheduleExpression` to set a cron or rate expression for the schedule
     * and `Duration` to set the length of the rotation window.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * RotationRulesProperty rotationRulesProperty = RotationRulesProperty.builder()
     * .automaticallyAfterDays(123)
     * .duration("duration")
     * .scheduleExpression("scheduleExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html)
     */
    public inline fun cfnRotationScheduleRotationRulesProperty(
        block: CfnRotationScheduleRotationRulesPropertyDsl.() -> Unit = {}
    ): CfnRotationSchedule.RotationRulesProperty {
        val builder = CfnRotationScheduleRotationRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new secret.
     *
     * A *secret* can be a password, a set of credentials such as a user name and password, an OAuth
     * token, or other secret information that you store in an encrypted form in Secrets Manager.
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * To retrieve a secret in a CloudFormation template, use a *dynamic reference* . For more
     * information, see
     * [Retrieve a secret in an AWS CloudFormation resource](https://docs.aws.amazon.com/secretsmanager/latest/userguide/cfn-example_reference-secret.html)
     * .
     *
     * A common scenario is to first create a secret with `GenerateSecretString` , which generates a
     * password, and then use a dynamic reference to retrieve the username and password from the
     * secret to use as credentials for a new database. See the example *Creating a Redshift cluster
     * and a secret for the admin credentials* .
     *
     * For information about creating a secret in the console, see
     * [Create a secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html)
     * . For information about creating a secret using the CLI or SDK, see
     * [CreateSecret](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html)
     * .
     *
     * For information about retrieving a secret in code, see
     * [Retrieve secrets from Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnSecret cfnSecret = CfnSecret.Builder.create(this, "MyCfnSecret")
     * .description("description")
     * .generateSecretString(GenerateSecretStringProperty.builder()
     * .excludeCharacters("excludeCharacters")
     * .excludeLowercase(false)
     * .excludeNumbers(false)
     * .excludePunctuation(false)
     * .excludeUppercase(false)
     * .generateStringKey("generateStringKey")
     * .includeSpace(false)
     * .passwordLength(123)
     * .requireEachIncludedType(false)
     * .secretStringTemplate("secretStringTemplate")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .name("name")
     * .replicaRegions(List.of(ReplicaRegionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build()))
     * .secretString("secretString")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html)
     */
    public inline fun cfnSecret(
        scope: Construct,
        id: String,
        block: CfnSecretDsl.() -> Unit = {},
    ): CfnSecret {
        val builder = CfnSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Generates a random password.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     *
     * *Required permissions:* `secretsmanager:GetRandomPassword` . For more information, see
     * [IAM policy actions for Secrets Manager](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awssecretsmanager.html#awssecretsmanager-actions-as-permissions)
     * and
     * [Authentication and access control in Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * GenerateSecretStringProperty generateSecretStringProperty =
     * GenerateSecretStringProperty.builder()
     * .excludeCharacters("excludeCharacters")
     * .excludeLowercase(false)
     * .excludeNumbers(false)
     * .excludePunctuation(false)
     * .excludeUppercase(false)
     * .generateStringKey("generateStringKey")
     * .includeSpace(false)
     * .passwordLength(123)
     * .requireEachIncludedType(false)
     * .secretStringTemplate("secretStringTemplate")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-generatesecretstring.html)
     */
    public inline fun cfnSecretGenerateSecretStringProperty(
        block: CfnSecretGenerateSecretStringPropertyDsl.() -> Unit = {}
    ): CfnSecret.GenerateSecretStringProperty {
        val builder = CfnSecretGenerateSecretStringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecret`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnSecretProps cfnSecretProps = CfnSecretProps.builder()
     * .description("description")
     * .generateSecretString(GenerateSecretStringProperty.builder()
     * .excludeCharacters("excludeCharacters")
     * .excludeLowercase(false)
     * .excludeNumbers(false)
     * .excludePunctuation(false)
     * .excludeUppercase(false)
     * .generateStringKey("generateStringKey")
     * .includeSpace(false)
     * .passwordLength(123)
     * .requireEachIncludedType(false)
     * .secretStringTemplate("secretStringTemplate")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .name("name")
     * .replicaRegions(List.of(ReplicaRegionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build()))
     * .secretString("secretString")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html)
     */
    public inline fun cfnSecretProps(block: CfnSecretPropsDsl.() -> Unit = {}): CfnSecretProps {
        val builder = CfnSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * ReplicaRegionProperty replicaRegionProperty = ReplicaRegionProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html)
     */
    public inline fun cfnSecretReplicaRegionProperty(
        block: CfnSecretReplicaRegionPropertyDsl.() -> Unit = {}
    ): CfnSecret.ReplicaRegionProperty {
        val builder = CfnSecretReplicaRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SecretsManager::SecretTargetAttachment` resource completes the final link between a
     * Secrets Manager secret and the associated database by adding the database connection
     * information to the secret JSON.
     *
     * If you want to turn on automatic rotation for a database credential secret, the secret must
     * contain the database connection information. For more information, see
     * [JSON structure of Secrets Manager database credential secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
     * .
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnSecretTargetAttachment cfnSecretTargetAttachment =
     * CfnSecretTargetAttachment.Builder.create(this, "MyCfnSecretTargetAttachment")
     * .secretId("secretId")
     * .targetId("targetId")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
     */
    public inline fun cfnSecretTargetAttachment(
        scope: Construct,
        id: String,
        block: CfnSecretTargetAttachmentDsl.() -> Unit = {},
    ): CfnSecretTargetAttachment {
        val builder = CfnSecretTargetAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecretTargetAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * CfnSecretTargetAttachmentProps cfnSecretTargetAttachmentProps =
     * CfnSecretTargetAttachmentProps.builder()
     * .secretId("secretId")
     * .targetId("targetId")
     * .targetType("targetType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
     */
    public inline fun cfnSecretTargetAttachmentProps(
        block: CfnSecretTargetAttachmentPropsDsl.() -> Unit = {}
    ): CfnSecretTargetAttachmentProps {
        val builder = CfnSecretTargetAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Multi user hosted rotation options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * MultiUserHostedRotationOptions multiUserHostedRotationOptions =
     * MultiUserHostedRotationOptions.builder()
     * .masterSecret(secret)
     * // the properties below are optional
     * .excludeCharacters("excludeCharacters")
     * .functionName("functionName")
     * .securityGroups(List.of(securityGroup))
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun multiUserHostedRotationOptions(
        block: MultiUserHostedRotationOptionsDsl.() -> Unit = {}
    ): MultiUserHostedRotationOptions {
        val builder = MultiUserHostedRotationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Secret replica region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Key key;
     * ReplicaRegion replicaRegion = ReplicaRegion.builder()
     * .region("region")
     * // the properties below are optional
     * .encryptionKey(key)
     * .build();
     * ```
     */
    public inline fun replicaRegion(block: ReplicaRegionDsl.() -> Unit = {}): ReplicaRegion {
        val builder = ReplicaRegionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Resource Policy for SecretsManager Secrets.
     *
     * Policies define the operations that are allowed on this resource.
     *
     * You almost never need to define this construct directly.
     *
     * All AWS resources that support resource policies have a method called
     * `addToResourcePolicy()`, which will automatically create a new resource policy if one doesn't
     * exist yet, otherwise it will add to the existing policy.
     *
     * Prefer to use `addToResourcePolicy()` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * ResourcePolicy resourcePolicy = ResourcePolicy.Builder.create(this, "MyResourcePolicy")
     * .secret(secret)
     * .build();
     * ```
     */
    public inline fun resourcePolicy(
        scope: Construct,
        id: String,
        block: ResourcePolicyDsl.() -> Unit = {},
    ): ResourcePolicy {
        val builder = ResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ResourcePolicy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * ResourcePolicyProps resourcePolicyProps = ResourcePolicyProps.builder()
     * .secret(secret)
     * .build();
     * ```
     */
    public inline fun resourcePolicyProps(
        block: ResourcePolicyPropsDsl.() -> Unit = {}
    ): ResourcePolicyProps {
        val builder = ResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rotation schedule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Function function_;
     * HostedRotation hostedRotation;
     * Secret secret;
     * RotationSchedule rotationSchedule = RotationSchedule.Builder.create(this, "MyRotationSchedule")
     * .secret(secret)
     * // the properties below are optional
     * .automaticallyAfter(Duration.minutes(30))
     * .hostedRotation(hostedRotation)
     * .rotateImmediatelyOnUpdate(false)
     * .rotationLambda(function_)
     * .build();
     * ```
     */
    public inline fun rotationSchedule(
        scope: Construct,
        id: String,
        block: RotationScheduleDsl.() -> Unit = {},
    ): RotationSchedule {
        val builder = RotationScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to add a rotation schedule to a secret.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn;
     * Secret secret = new Secret(this, "Secret");
     * secret.addRotationSchedule("RotationSchedule", RotationScheduleOptions.builder()
     * .rotationLambda(fn)
     * .automaticallyAfter(Duration.days(15))
     * .rotateImmediatelyOnUpdate(false)
     * .build());
     * ```
     */
    public inline fun rotationScheduleOptions(
        block: RotationScheduleOptionsDsl.() -> Unit = {}
    ): RotationScheduleOptions {
        val builder = RotationScheduleOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a RotationSchedule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Function function_;
     * HostedRotation hostedRotation;
     * Secret secret;
     * RotationScheduleProps rotationScheduleProps = RotationScheduleProps.builder()
     * .secret(secret)
     * // the properties below are optional
     * .automaticallyAfter(Duration.minutes(30))
     * .hostedRotation(hostedRotation)
     * .rotateImmediatelyOnUpdate(false)
     * .rotationLambda(function_)
     * .build();
     * ```
     */
    public inline fun rotationScheduleProps(
        block: RotationSchedulePropsDsl.() -> Unit = {}
    ): RotationScheduleProps {
        val builder = RotationSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new secret in AWS SecretsManager.
     *
     * Example:
     * ```
     * Stack stack;
     * User user = new User(this, "User");
     * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
     * Secret.Builder.create(this, "Secret")
     * .secretObjectValue(Map.of(
     * "username", SecretValue.unsafePlainText(user.getUserName()),
     * "database", SecretValue.unsafePlainText("foo"),
     * "password", accessKey.getSecretAccessKey()))
     * .build();
     * ```
     */
    public inline fun secret(
        scope: Construct,
        id: String,
        block: SecretDsl.() -> Unit = {},
    ): Secret {
        val builder = SecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attachment target specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * SecretAttachmentTargetProps secretAttachmentTargetProps = SecretAttachmentTargetProps.builder()
     * .targetId("targetId")
     * .targetType(AttachmentTargetType.RDS_DB_INSTANCE)
     * .build();
     * ```
     */
    public inline fun secretAttachmentTargetProps(
        block: SecretAttachmentTargetPropsDsl.() -> Unit = {}
    ): SecretAttachmentTargetProps {
        val builder = SecretAttachmentTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes required to import an existing secret into the Stack.
     *
     * One ARN format (`secretArn`, `secretCompleteArn`, `secretPartialArn`) must be provided.
     *
     * Example:
     * ```
     * UserPool userpool = new UserPool(this, "Pool");
     * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
     * SecretAttributes.builder()
     * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
     * .build()).getSecretValue();
     * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
     * "Google")
     * .clientId("amzn-client-id")
     * .clientSecretValue(secret)
     * .userPool(userpool)
     * .build();
     * ```
     */
    public inline fun secretAttributes(
        block: SecretAttributesDsl.() -> Unit = {}
    ): SecretAttributes {
        val builder = SecretAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties required to create a new secret in AWS Secrets Manager.
     *
     * Example:
     * ```
     * Stack stack;
     * User user = new User(this, "User");
     * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
     * Secret.Builder.create(this, "Secret")
     * .secretObjectValue(Map.of(
     * "username", SecretValue.unsafePlainText(user.getUserName()),
     * "database", SecretValue.unsafePlainText("foo"),
     * "password", accessKey.getSecretAccessKey()))
     * .build();
     * ```
     */
    public inline fun secretProps(block: SecretPropsDsl.() -> Unit = {}): SecretProps {
        val builder = SecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Secret rotation for a service or database.
     *
     * Example:
     * ```
     * Secret myUserSecret;
     * Secret myMasterSecret;
     * IConnectable myDatabase;
     * Vpc myVpc;
     * SecretRotation.Builder.create(this, "SecretRotation")
     * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
     * .secret(myUserSecret) // The secret that will be rotated
     * .masterSecret(myMasterSecret) // The secret used for the rotation
     * .target(myDatabase)
     * .vpc(myVpc)
     * .build();
     * ```
     */
    public inline fun secretRotation(
        scope: Construct,
        id: String,
        block: SecretRotationDsl.() -> Unit = {},
    ): SecretRotation {
        val builder = SecretRotationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A secret rotation serverless application.
     *
     * Example:
     * ```
     * Secret myUserSecret;
     * Secret myMasterSecret;
     * IConnectable myDatabase;
     * Vpc myVpc;
     * SecretRotation.Builder.create(this, "SecretRotation")
     * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
     * .secret(myUserSecret) // The secret that will be rotated
     * .masterSecret(myMasterSecret) // The secret used for the rotation
     * .target(myDatabase)
     * .vpc(myVpc)
     * .build();
     * ```
     */
    public inline fun secretRotationApplication(
        applicationId: String,
        semanticVersion: String,
        block: SecretRotationApplicationDsl.() -> Unit = {},
    ): SecretRotationApplication {
        val builder = SecretRotationApplicationDsl(applicationId, semanticVersion)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a SecretRotationApplication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * SecretRotationApplicationOptions secretRotationApplicationOptions =
     * SecretRotationApplicationOptions.builder()
     * .isMultiUser(false)
     * .build();
     * ```
     */
    public inline fun secretRotationApplicationOptions(
        block: SecretRotationApplicationOptionsDsl.() -> Unit = {}
    ): SecretRotationApplicationOptions {
        val builder = SecretRotationApplicationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a SecretRotation.
     *
     * Example:
     * ```
     * Secret myUserSecret;
     * Secret myMasterSecret;
     * IConnectable myDatabase;
     * Vpc myVpc;
     * SecretRotation.Builder.create(this, "SecretRotation")
     * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
     * .secret(myUserSecret) // The secret that will be rotated
     * .masterSecret(myMasterSecret) // The secret used for the rotation
     * .target(myDatabase)
     * .vpc(myVpc)
     * .build();
     * ```
     */
    public inline fun secretRotationProps(
        block: SecretRotationPropsDsl.() -> Unit = {}
    ): SecretRotationProps {
        val builder = SecretRotationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration to generate secrets such as passwords automatically.
     *
     * Example:
     * ```
     * IVpc vpc;
     * DatabaseInstance instance1 = DatabaseInstance.Builder.create(this, "PostgresInstance1")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * // Generate the secret with admin username `postgres` and random password
     * .credentials(Credentials.fromGeneratedSecret("postgres"))
     * .vpc(vpc)
     * .build();
     * // Templated secret with username and password fields
     * Secret templatedSecret = Secret.Builder.create(this, "TemplatedSecret")
     * .generateSecretString(SecretStringGenerator.builder()
     * .secretStringTemplate(JSON.stringify(Map.of("username", "postgres")))
     * .generateStringKey("password")
     * .excludeCharacters("/&#64;\"")
     * .build())
     * .build();
     * // Using the templated secret as credentials
     * DatabaseInstance instance2 = DatabaseInstance.Builder.create(this, "PostgresInstance2")
     * .engine(DatabaseInstanceEngine.POSTGRES)
     * .credentials(Map.of(
     * "username", templatedSecret.secretValueFromJson("username").toString(),
     * "password", templatedSecret.secretValueFromJson("password")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun secretStringGenerator(
        block: SecretStringGeneratorDsl.() -> Unit = {}
    ): SecretStringGenerator {
        val builder = SecretStringGeneratorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An attached secret.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * ISecretAttachmentTarget secretAttachmentTarget;
     * SecretTargetAttachment secretTargetAttachment = SecretTargetAttachment.Builder.create(this,
     * "MySecretTargetAttachment")
     * .secret(secret)
     * .target(secretAttachmentTarget)
     * .build();
     * ```
     */
    public inline fun secretTargetAttachment(
        scope: Construct,
        id: String,
        block: SecretTargetAttachmentDsl.() -> Unit = {},
    ): SecretTargetAttachment {
        val builder = SecretTargetAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for an AttachedSecret.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * ISecretAttachmentTarget secretAttachmentTarget;
     * SecretTargetAttachmentProps secretTargetAttachmentProps = SecretTargetAttachmentProps.builder()
     * .secret(secret)
     * .target(secretAttachmentTarget)
     * .build();
     * ```
     */
    public inline fun secretTargetAttachmentProps(
        block: SecretTargetAttachmentPropsDsl.() -> Unit = {}
    ): SecretTargetAttachmentProps {
        val builder = SecretTargetAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Single user hosted rotation options.
     *
     * Example:
     * ```
     * IVpc myVpc;
     * Connections dbConnections;
     * Secret secret;
     * HostedRotation myHostedRotation =
     * HostedRotation.mysqlSingleUser(SingleUserHostedRotationOptions.builder().vpc(myVpc).build());
     * secret.addRotationSchedule("RotationSchedule",
     * RotationScheduleOptions.builder().hostedRotation(myHostedRotation).build());
     * dbConnections.allowDefaultPortFrom(myHostedRotation);
     * ```
     */
    public inline fun singleUserHostedRotationOptions(
        block: SingleUserHostedRotationOptionsDsl.() -> Unit = {}
    ): SingleUserHostedRotationOptions {
        val builder = SingleUserHostedRotationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}

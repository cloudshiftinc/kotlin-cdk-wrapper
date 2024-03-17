@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworkscm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworkscm.*;
 * CfnServerProps cfnServerProps = CfnServerProps.builder()
 * .instanceProfileArn("instanceProfileArn")
 * .instanceType("instanceType")
 * .serviceRoleArn("serviceRoleArn")
 * // the properties below are optional
 * .associatePublicIpAddress(false)
 * .backupId("backupId")
 * .backupRetentionCount(123)
 * .customCertificate("customCertificate")
 * .customDomain("customDomain")
 * .customPrivateKey("customPrivateKey")
 * .disableAutomatedBackup(false)
 * .engine("engine")
 * .engineAttributes(List.of(EngineAttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .engineModel("engineModel")
 * .engineVersion("engineVersion")
 * .keyPair("keyPair")
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .serverName("serverName")
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html)
 */
public interface CfnServerProps {
  /**
   * Associate a public IP address with a server that you are launching.
   *
   * Valid values are `true` or `false` . The default value is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
   */
  public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  /**
   * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
   * by BackupId.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid)
   */
  public fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * The number of automated backups that you want to keep.
   *
   * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number is
   * exceeded. The default value is `1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount)
   */
  public fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

  /**
   * Supported on servers running Chef Automate 2.0 only. A PEM-formatted HTTPS certificate. The
   * value can be be a single, self-signed certificate, or a certificate chain. If you specify a custom
   * certificate, you must also specify values for `CustomDomain` and `CustomPrivateKey` . The
   * following are requirements for the `CustomCertificate` value:.
   *
   * * You can provide either a self-signed, custom certificate, or the full certificate chain.
   * * The certificate must be a valid X509 certificate, or a certificate chain in PEM format.
   * * The certificate must be valid at the time of upload. A certificate can't be used before its
   * validity period begins (the certificate's `NotBefore` date), or after it expires (the
   * certificate's `NotAfter` date).
   * * The certificate’s common name or subject alternative names (SANs), if present, must match the
   * value of `CustomDomain` .
   * * The certificate must match the value of `CustomPrivateKey` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate)
   */
  public fun customCertificate(): String? = unwrap(this).getCustomCertificate()

  /**
   * Supported on servers running Chef Automate 2.0 only. An optional public endpoint of a server,
   * such as `https://aws.my-company.com` . To access the server, create a CNAME DNS record in your
   * preferred DNS service that points the custom domain to the endpoint that is generated when the
   * server is created (the value of the CreateServer Endpoint attribute). You cannot access the server
   * by using the generated `Endpoint` value if the server is using a custom domain. If you specify a
   * custom domain, you must also specify values for `CustomCertificate` and `CustomPrivateKey` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain)
   */
  public fun customDomain(): String? = unwrap(this).getCustomDomain()

  /**
   * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for connecting
   * to the server by using HTTPS. The private key must not be encrypted; it cannot be protected by a
   * password or passphrase. If you specify a custom private key, you must also specify values for
   * `CustomDomain` and `CustomCertificate` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey)
   */
  public fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

  /**
   * Enable or disable scheduled backups.
   *
   * Valid values are `true` or `false` . The default value is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
   */
  public fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

  /**
   * The configuration management engine to use.
   *
   * Valid values include `ChefAutomate` and `Puppet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * Optional engine attributes on a specified server.
   *
   * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
   * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
   * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the response.
   * When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the AWS
   * CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of the
   * pivotal key value.
   *
   * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
   * Automate web-based dashboard. The password length is a minimum of eight characters, and a maximum
   * of 32. The password can contain letters, numbers, and special characters (!/&#64;#$%^&amp;+=_).
   * The password must contain at least one lower case letter, one upper case letter, one number, and
   * one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one is generated and returned
   * in the response.
   *
   * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
   * with the Puppet Enterprise console, a password must use ASCII characters.
   *
   * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
   * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
   * 8170.
   * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
   * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes)
   */
  public fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

  /**
   * The engine model of the server.
   *
   * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel)
   */
  public fun engineModel(): String? = unwrap(this).getEngineModel()

  /**
   * The major release version of the engine that you want to use.
   *
   * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
   * valid values are `2019` or `2017` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The ARN of the instance profile that your Amazon EC2 instances use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn)
   */
  public fun instanceProfileArn(): String

  /**
   * The Amazon EC2 instance type to use.
   *
   * For example, `m5.large` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype)
   */
  public fun instanceType(): String

  /**
   * The Amazon EC2 key pair to set for the instance.
   *
   * This parameter is optional; if desired, you may specify this parameter to connect to your
   * instances by using SSH.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair)
   */
  public fun keyPair(): String? = unwrap(this).getKeyPair()

  /**
   * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level
   * data on your server if automated backups are enabled.
   *
   * Valid values must be specified in one of the following formats:
   *
   * * `HH:MM` for daily backups
   * * `DDD:HH:MM` for weekly backups
   *
   * `MM` must be specified as `00` . The specified time is in coordinated universal time (UTC). The
   * default value is a random, daily start time.
   *
   * *Example:* `08:00` , which represents a daily start time of 08:00 UTC.
   *
   * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
   * a.m.)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The start time for a one-hour period each week during which AWS OpsWorks CM performs
   * maintenance on the instance.
   *
   * Valid values must be specified in the following format: `DDD:HH:MM` . `MM` must be specified as
   * `00` . The specified time is in coordinated universal time (UTC). The default value is a random
   * one-hour period on Tuesday, Wednesday, or Friday. See `TimeWindowDefinition` for more information.
   *
   * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
   * a.m.)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * A list of security group IDs to attach to the Amazon EC2 instance.
   *
   * If you add this parameter, the specified security groups must be within the VPC that is
   * specified by `SubnetIds` .
   *
   * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses
   * TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername)
   */
  public fun serverName(): String? = unwrap(this).getServerName()

  /**
   * The service role that the AWS OpsWorks CM service backend uses to work with your account.
   *
   * Although the AWS OpsWorks management console typically creates the service role for you, if you
   * are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation
   * template, located at
   * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml.
   * This template creates a CloudFormation stack that includes the service role and instance profile
   * that you need.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn)
   */
  public fun serviceRoleArn(): String

  /**
   * The IDs of subnets in which to launch the server EC2 instance.
   *
   * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
   * VPC must have "Auto Assign Public IP" enabled.
   *
   * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances
   * are created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC
   * must have "Auto Assign Public IP" enabled.
   *
   * For more information about supported Amazon EC2 platforms, see [Supported
   * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
   * OpsWorks for Puppet Enterprise server.
   *
   * * The key cannot be empty.
   * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or
   * separators, or the following special characters: `+ - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

    /**
     * @param backupId If you specify this field, AWS OpsWorks CM creates the server by using the
     * backup represented by BackupId.
     */
    public fun backupId(backupId: String)

    /**
     * @param backupRetentionCount The number of automated backups that you want to keep.
     * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number
     * is exceeded. The default value is `1` .
     */
    public fun backupRetentionCount(backupRetentionCount: Number)

    /**
     * @param customCertificate Supported on servers running Chef Automate 2.0 only. A PEM-formatted
     * HTTPS certificate. The value can be be a single, self-signed certificate, or a certificate
     * chain. If you specify a custom certificate, you must also specify values for `CustomDomain` and
     * `CustomPrivateKey` . The following are requirements for the `CustomCertificate` value:.
     * * You can provide either a self-signed, custom certificate, or the full certificate chain.
     * * The certificate must be a valid X509 certificate, or a certificate chain in PEM format.
     * * The certificate must be valid at the time of upload. A certificate can't be used before its
     * validity period begins (the certificate's `NotBefore` date), or after it expires (the
     * certificate's `NotAfter` date).
     * * The certificate’s common name or subject alternative names (SANs), if present, must match
     * the value of `CustomDomain` .
     * * The certificate must match the value of `CustomPrivateKey` .
     */
    public fun customCertificate(customCertificate: String)

    /**
     * @param customDomain Supported on servers running Chef Automate 2.0 only. An optional public
     * endpoint of a server, such as `https://aws.my-company.com` . To access the server, create a
     * CNAME DNS record in your preferred DNS service that points the custom domain to the endpoint
     * that is generated when the server is created (the value of the CreateServer Endpoint attribute).
     * You cannot access the server by using the generated `Endpoint` value if the server is using a
     * custom domain. If you specify a custom domain, you must also specify values for
     * `CustomCertificate` and `CustomPrivateKey` .
     */
    public fun customDomain(customDomain: String)

    /**
     * @param customPrivateKey Supported on servers running Chef Automate 2.0 only. A private key in
     * PEM format for connecting to the server by using HTTPS. The private key must not be encrypted;
     * it cannot be protected by a password or passphrase. If you specify a custom private key, you
     * must also specify values for `CustomDomain` and `CustomCertificate` .
     */
    public fun customPrivateKey(customPrivateKey: String)

    /**
     * @param disableAutomatedBackup Enable or disable scheduled backups.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    public fun disableAutomatedBackup(disableAutomatedBackup: Boolean)

    /**
     * @param disableAutomatedBackup Enable or disable scheduled backups.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    public fun disableAutomatedBackup(disableAutomatedBackup: IResolvable)

    /**
     * @param engine The configuration management engine to use.
     * Valid values include `ChefAutomate` and `Puppet` .
     */
    public fun engine(engine: String)

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    public fun engineAttributes(engineAttributes: IResolvable)

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    public fun engineAttributes(engineAttributes: List<Any>)

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    public fun engineAttributes(vararg engineAttributes: Any)

    /**
     * @param engineModel The engine model of the server.
     * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
     */
    public fun engineModel(engineModel: String)

    /**
     * @param engineVersion The major release version of the engine that you want to use.
     * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
     * valid values are `2019` or `2017` .
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param instanceProfileArn The ARN of the instance profile that your Amazon EC2 instances use.
     * 
     */
    public fun instanceProfileArn(instanceProfileArn: String)

    /**
     * @param instanceType The Amazon EC2 instance type to use. 
     * For example, `m5.large` .
     */
    public fun instanceType(instanceType: String)

    /**
     * @param keyPair The Amazon EC2 key pair to set for the instance.
     * This parameter is optional; if desired, you may specify this parameter to connect to your
     * instances by using SSH.
     */
    public fun keyPair(keyPair: String)

    /**
     * @param preferredBackupWindow The start time for a one-hour period during which AWS OpsWorks
     * CM backs up application-level data on your server if automated backups are enabled.
     * Valid values must be specified in one of the following formats:
     *
     * * `HH:MM` for daily backups
     * * `DDD:HH:MM` for weekly backups
     *
     * `MM` must be specified as `00` . The specified time is in coordinated universal time (UTC).
     * The default value is a random, daily start time.
     *
     * *Example:* `08:00` , which represents a daily start time of 08:00 UTC.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The start time for a one-hour period each week during which
     * AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: `DDD:HH:MM` . `MM` must be specified
     * as `00` . The specified time is in coordinated universal time (UTC). The default value is a
     * random one-hour period on Tuesday, Wednesday, or Friday. See `TimeWindowDefinition` for more
     * information.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance.
     * If you add this parameter, the specified security groups must be within the VPC that is
     * specified by `SubnetIds` .
     *
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that
     * uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance.
     * If you add this parameter, the specified security groups must be within the VPC that is
     * specified by `SubnetIds` .
     *
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that
     * uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param serverName the value to be set.
     */
    public fun serverName(serverName: String)

    /**
     * @param serviceRoleArn The service role that the AWS OpsWorks CM service backend uses to work
     * with your account. 
     * Although the AWS OpsWorks management console typically creates the service role for you, if
     * you are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation
     * template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml.
     * This template creates a CloudFormation stack that includes the service role and instance profile
     * that you need.
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance.
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
     * VPC must have "Auto Assign Public IP" enabled.
     *
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2
     * instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet
     * IDs, the VPC must have "Auto Assign Public IP" enabled.
     *
     * For more information about supported Amazon EC2 platforms, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance.
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
     * VPC must have "Auto Assign Public IP" enabled.
     *
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2
     * instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet
     * IDs, the VPC must have "Auto Assign Public IP" enabled.
     *
     * For more information about supported Amazon EC2 platforms, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder =
        software.amazon.awscdk.services.opsworkscm.CfnServerProps.builder()

    /**
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    /**
     * @param backupId If you specify this field, AWS OpsWorks CM creates the server by using the
     * backup represented by BackupId.
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * @param backupRetentionCount The number of automated backups that you want to keep.
     * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number
     * is exceeded. The default value is `1` .
     */
    override fun backupRetentionCount(backupRetentionCount: Number) {
      cdkBuilder.backupRetentionCount(backupRetentionCount)
    }

    /**
     * @param customCertificate Supported on servers running Chef Automate 2.0 only. A PEM-formatted
     * HTTPS certificate. The value can be be a single, self-signed certificate, or a certificate
     * chain. If you specify a custom certificate, you must also specify values for `CustomDomain` and
     * `CustomPrivateKey` . The following are requirements for the `CustomCertificate` value:.
     * * You can provide either a self-signed, custom certificate, or the full certificate chain.
     * * The certificate must be a valid X509 certificate, or a certificate chain in PEM format.
     * * The certificate must be valid at the time of upload. A certificate can't be used before its
     * validity period begins (the certificate's `NotBefore` date), or after it expires (the
     * certificate's `NotAfter` date).
     * * The certificate’s common name or subject alternative names (SANs), if present, must match
     * the value of `CustomDomain` .
     * * The certificate must match the value of `CustomPrivateKey` .
     */
    override fun customCertificate(customCertificate: String) {
      cdkBuilder.customCertificate(customCertificate)
    }

    /**
     * @param customDomain Supported on servers running Chef Automate 2.0 only. An optional public
     * endpoint of a server, such as `https://aws.my-company.com` . To access the server, create a
     * CNAME DNS record in your preferred DNS service that points the custom domain to the endpoint
     * that is generated when the server is created (the value of the CreateServer Endpoint attribute).
     * You cannot access the server by using the generated `Endpoint` value if the server is using a
     * custom domain. If you specify a custom domain, you must also specify values for
     * `CustomCertificate` and `CustomPrivateKey` .
     */
    override fun customDomain(customDomain: String) {
      cdkBuilder.customDomain(customDomain)
    }

    /**
     * @param customPrivateKey Supported on servers running Chef Automate 2.0 only. A private key in
     * PEM format for connecting to the server by using HTTPS. The private key must not be encrypted;
     * it cannot be protected by a password or passphrase. If you specify a custom private key, you
     * must also specify values for `CustomDomain` and `CustomCertificate` .
     */
    override fun customPrivateKey(customPrivateKey: String) {
      cdkBuilder.customPrivateKey(customPrivateKey)
    }

    /**
     * @param disableAutomatedBackup Enable or disable scheduled backups.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    override fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    /**
     * @param disableAutomatedBackup Enable or disable scheduled backups.
     * Valid values are `true` or `false` . The default value is `true` .
     */
    override fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup.let(IResolvable::unwrap))
    }

    /**
     * @param engine The configuration management engine to use.
     * Valid values include `ChefAutomate` and `Puppet` .
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    override fun engineAttributes(engineAttributes: IResolvable) {
      cdkBuilder.engineAttributes(engineAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    override fun engineAttributes(engineAttributes: List<Any>) {
      cdkBuilder.engineAttributes(engineAttributes)
    }

    /**
     * @param engineAttributes Optional engine attributes on a specified server.
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     */
    override fun engineAttributes(vararg engineAttributes: Any): Unit =
        engineAttributes(engineAttributes.toList())

    /**
     * @param engineModel The engine model of the server.
     * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
     */
    override fun engineModel(engineModel: String) {
      cdkBuilder.engineModel(engineModel)
    }

    /**
     * @param engineVersion The major release version of the engine that you want to use.
     * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
     * valid values are `2019` or `2017` .
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param instanceProfileArn The ARN of the instance profile that your Amazon EC2 instances use.
     * 
     */
    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * @param instanceType The Amazon EC2 instance type to use. 
     * For example, `m5.large` .
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param keyPair The Amazon EC2 key pair to set for the instance.
     * This parameter is optional; if desired, you may specify this parameter to connect to your
     * instances by using SSH.
     */
    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    /**
     * @param preferredBackupWindow The start time for a one-hour period during which AWS OpsWorks
     * CM backs up application-level data on your server if automated backups are enabled.
     * Valid values must be specified in one of the following formats:
     *
     * * `HH:MM` for daily backups
     * * `DDD:HH:MM` for weekly backups
     *
     * `MM` must be specified as `00` . The specified time is in coordinated universal time (UTC).
     * The default value is a random, daily start time.
     *
     * *Example:* `08:00` , which represents a daily start time of 08:00 UTC.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The start time for a one-hour period each week during which
     * AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: `DDD:HH:MM` . `MM` must be specified
     * as `00` . The specified time is in coordinated universal time (UTC). The default value is a
     * random one-hour period on Tuesday, Wednesday, or Friday. See `TimeWindowDefinition` for more
     * information.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance.
     * If you add this parameter, the specified security groups must be within the VPC that is
     * specified by `SubnetIds` .
     *
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that
     * uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance.
     * If you add this parameter, the specified security groups must be within the VPC that is
     * specified by `SubnetIds` .
     *
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that
     * uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param serverName the value to be set.
     */
    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    /**
     * @param serviceRoleArn The service role that the AWS OpsWorks CM service backend uses to work
     * with your account. 
     * Although the AWS OpsWorks management console typically creates the service role for you, if
     * you are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation
     * template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml.
     * This template creates a CloudFormation stack that includes the service role and instance profile
     * that you need.
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance.
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
     * VPC must have "Auto Assign Public IP" enabled.
     *
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2
     * instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet
     * IDs, the VPC must have "Auto Assign Public IP" enabled.
     *
     * For more information about supported Amazon EC2 platforms, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance.
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
     * VPC must have "Auto Assign Public IP" enabled.
     *
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2
     * instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet
     * IDs, the VPC must have "Auto Assign Public IP" enabled.
     *
     * For more information about supported Amazon EC2 platforms, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.opsworkscm.CfnServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServerProps,
  ) : CdkObject(cdkObject), CfnServerProps {
    /**
     * Associate a public IP address with a server that you are launching.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
     */
    override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
     * by BackupId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid)
     */
    override fun backupId(): String? = unwrap(this).getBackupId()

    /**
     * The number of automated backups that you want to keep.
     *
     * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number
     * is exceeded. The default value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount)
     */
    override fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

    /**
     * Supported on servers running Chef Automate 2.0 only. A PEM-formatted HTTPS certificate. The
     * value can be be a single, self-signed certificate, or a certificate chain. If you specify a
     * custom certificate, you must also specify values for `CustomDomain` and `CustomPrivateKey` . The
     * following are requirements for the `CustomCertificate` value:.
     *
     * * You can provide either a self-signed, custom certificate, or the full certificate chain.
     * * The certificate must be a valid X509 certificate, or a certificate chain in PEM format.
     * * The certificate must be valid at the time of upload. A certificate can't be used before its
     * validity period begins (the certificate's `NotBefore` date), or after it expires (the
     * certificate's `NotAfter` date).
     * * The certificate’s common name or subject alternative names (SANs), if present, must match
     * the value of `CustomDomain` .
     * * The certificate must match the value of `CustomPrivateKey` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate)
     */
    override fun customCertificate(): String? = unwrap(this).getCustomCertificate()

    /**
     * Supported on servers running Chef Automate 2.0 only. An optional public endpoint of a server,
     * such as `https://aws.my-company.com` . To access the server, create a CNAME DNS record in your
     * preferred DNS service that points the custom domain to the endpoint that is generated when the
     * server is created (the value of the CreateServer Endpoint attribute). You cannot access the
     * server by using the generated `Endpoint` value if the server is using a custom domain. If you
     * specify a custom domain, you must also specify values for `CustomCertificate` and
     * `CustomPrivateKey` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain)
     */
    override fun customDomain(): String? = unwrap(this).getCustomDomain()

    /**
     * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for
     * connecting to the server by using HTTPS. The private key must not be encrypted; it cannot be
     * protected by a password or passphrase. If you specify a custom private key, you must also
     * specify values for `CustomDomain` and `CustomCertificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey)
     */
    override fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

    /**
     * Enable or disable scheduled backups.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
     */
    override fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

    /**
     * The configuration management engine to use.
     *
     * Valid values include `ChefAutomate` and `Puppet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * Optional engine attributes on a specified server.
     *
     * **Attributes accepted in a Chef createServer request:** - `CHEF_AUTOMATE_PIVOTAL_KEY` : A
     * base64-encoded RSA public key. The corresponding private key is required to access the Chef API.
     * When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the
     * response. When you are specifying the value of CHEF_AUTOMATE_PIVOTAL_KEY as a parameter in the
     * AWS CloudFormation console, you must add newline ( `\n` ) characters at the end of each line of
     * the pivotal key value.
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD` : The password for the administrative user in the Chef
     * Automate web-based dashboard. The password length is a minimum of eight characters, and a
     * maximum of 32. The password can contain letters, numbers, and special characters
     * (!/&#64;#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case
     * letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one
     * is generated and returned in the response.
     *
     * **Attributes accepted in a Puppet createServer request:** - `PUPPET_ADMIN_PASSWORD` : To work
     * with the Puppet Enterprise console, a password must use ASCII characters.
     *
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes)
     */
    override fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

    /**
     * The engine model of the server.
     *
     * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel)
     */
    override fun engineModel(): String? = unwrap(this).getEngineModel()

    /**
     * The major release version of the engine that you want to use.
     *
     * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
     * valid values are `2019` or `2017` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The ARN of the instance profile that your Amazon EC2 instances use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn)
     */
    override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    /**
     * The Amazon EC2 instance type to use.
     *
     * For example, `m5.large` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The Amazon EC2 key pair to set for the instance.
     *
     * This parameter is optional; if desired, you may specify this parameter to connect to your
     * instances by using SSH.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair)
     */
    override fun keyPair(): String? = unwrap(this).getKeyPair()

    /**
     * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level
     * data on your server if automated backups are enabled.
     *
     * Valid values must be specified in one of the following formats:
     *
     * * `HH:MM` for daily backups
     * * `DDD:HH:MM` for weekly backups
     *
     * `MM` must be specified as `00` . The specified time is in coordinated universal time (UTC).
     * The default value is a random, daily start time.
     *
     * *Example:* `08:00` , which represents a daily start time of 08:00 UTC.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * The start time for a one-hour period each week during which AWS OpsWorks CM performs
     * maintenance on the instance.
     *
     * Valid values must be specified in the following format: `DDD:HH:MM` . `MM` must be specified
     * as `00` . The specified time is in coordinated universal time (UTC). The default value is a
     * random one-hour period on Tuesday, Wednesday, or Friday. See `TimeWindowDefinition` for more
     * information.
     *
     * *Example:* `Mon:08:00` , which represents a start time of every Monday at 08:00 UTC. (8:00
     * a.m.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * A list of security group IDs to attach to the Amazon EC2 instance.
     *
     * If you add this parameter, the specified security groups must be within the VPC that is
     * specified by `SubnetIds` .
     *
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that
     * uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername)
     */
    override fun serverName(): String? = unwrap(this).getServerName()

    /**
     * The service role that the AWS OpsWorks CM service backend uses to work with your account.
     *
     * Although the AWS OpsWorks management console typically creates the service role for you, if
     * you are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation
     * template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml.
     * This template creates a CloudFormation stack that includes the service role and instance profile
     * that you need.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn)
     */
    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    /**
     * The IDs of subnets in which to launch the server EC2 instance.
     *
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The
     * VPC must have "Auto Assign Public IP" enabled.
     *
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2
     * instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet
     * IDs, the VPC must have "Auto Assign Public IP" enabled.
     *
     * For more information about supported Amazon EC2 platforms, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
     * OpsWorks for Puppet Enterprise server.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServerProps):
        CfnServerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerProps):
        software.amazon.awscdk.services.opsworkscm.CfnServerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.opsworkscm.CfnServerProps
  }
}

package io.cloudshiftdev.awscdk.services.opsworkscm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Associate a public IP address with a server that you are launching.
   */
  public open fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  /**
   * Associate a public IP address with a server that you are launching.
   */
  public open fun associatePublicIpAddress(`value`: Boolean) {
    unwrap(this).setAssociatePublicIpAddress(`value`)
  }

  /**
   * Associate a public IP address with a server that you are launching.
   */
  public open fun associatePublicIpAddress(`value`: IResolvable) {
    unwrap(this).setAssociatePublicIpAddress(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the server, such as
   * `arn:aws:OpsWorksCM:us-east-1:123456789012:server/server-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A DNS name that can be used to access the engine.
   *
   * Example: `myserver-asdfghjkl.us-east-1.opsworks.io` .
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * The name of the server.
   */
  public open fun attrServerName(): String = unwrap(this).getAttrServerName()

  /**
   * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
   * by BackupId.
   */
  public open fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
   * by BackupId.
   */
  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
  }

  /**
   * The number of automated backups that you want to keep.
   */
  public open fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

  /**
   * The number of automated backups that you want to keep.
   */
  public open fun backupRetentionCount(`value`: Number) {
    unwrap(this).setBackupRetentionCount(`value`)
  }

  /**
   * Supported on servers running Chef Automate 2.0 only. A PEM-formatted HTTPS certificate. The
   * value can be be a single, self-signed certificate, or a certificate chain. If you specify a custom
   * certificate, you must also specify values for `CustomDomain` and `CustomPrivateKey` . The
   * following are requirements for the `CustomCertificate` value:.
   */
  public open fun customCertificate(): String? = unwrap(this).getCustomCertificate()

  /**
   * Supported on servers running Chef Automate 2.0 only. A PEM-formatted HTTPS certificate. The
   * value can be be a single, self-signed certificate, or a certificate chain. If you specify a custom
   * certificate, you must also specify values for `CustomDomain` and `CustomPrivateKey` . The
   * following are requirements for the `CustomCertificate` value:.
   */
  public open fun customCertificate(`value`: String) {
    unwrap(this).setCustomCertificate(`value`)
  }

  /**
   * Supported on servers running Chef Automate 2.0 only. An optional public endpoint of a server,
   * such as `https://aws.my-company.com` . To access the server, create a CNAME DNS record in your
   * preferred DNS service that points the custom domain to the endpoint that is generated when the
   * server is created (the value of the CreateServer Endpoint attribute). You cannot access the server
   * by using the generated `Endpoint` value if the server is using a custom domain. If you specify a
   * custom domain, you must also specify values for `CustomCertificate` and `CustomPrivateKey` .
   */
  public open fun customDomain(): String? = unwrap(this).getCustomDomain()

  /**
   * Supported on servers running Chef Automate 2.0 only. An optional public endpoint of a server,
   * such as `https://aws.my-company.com` . To access the server, create a CNAME DNS record in your
   * preferred DNS service that points the custom domain to the endpoint that is generated when the
   * server is created (the value of the CreateServer Endpoint attribute). You cannot access the server
   * by using the generated `Endpoint` value if the server is using a custom domain. If you specify a
   * custom domain, you must also specify values for `CustomCertificate` and `CustomPrivateKey` .
   */
  public open fun customDomain(`value`: String) {
    unwrap(this).setCustomDomain(`value`)
  }

  /**
   * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for connecting
   * to the server by using HTTPS. The private key must not be encrypted; it cannot be protected by a
   * password or passphrase. If you specify a custom private key, you must also specify values for
   * `CustomDomain` and `CustomCertificate` .
   */
  public open fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

  /**
   * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for connecting
   * to the server by using HTTPS. The private key must not be encrypted; it cannot be protected by a
   * password or passphrase. If you specify a custom private key, you must also specify values for
   * `CustomDomain` and `CustomCertificate` .
   */
  public open fun customPrivateKey(`value`: String) {
    unwrap(this).setCustomPrivateKey(`value`)
  }

  /**
   * Enable or disable scheduled backups.
   */
  public open fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

  /**
   * Enable or disable scheduled backups.
   */
  public open fun disableAutomatedBackup(`value`: Boolean) {
    unwrap(this).setDisableAutomatedBackup(`value`)
  }

  /**
   * Enable or disable scheduled backups.
   */
  public open fun disableAutomatedBackup(`value`: IResolvable) {
    unwrap(this).setDisableAutomatedBackup(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration management engine to use.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * The configuration management engine to use.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * Optional engine attributes on a specified server.
   */
  public open fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

  /**
   * Optional engine attributes on a specified server.
   */
  public open fun engineAttributes(`value`: IResolvable) {
    unwrap(this).setEngineAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional engine attributes on a specified server.
   */
  public open fun engineAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setEngineAttributes(__idx_ac66f0)
  }

  /**
   * Optional engine attributes on a specified server.
   */
  public open fun engineAttributes(vararg __idx_ac66f0: Any): Unit =
      engineAttributes(__idx_ac66f0.toList())

  /**
   * The engine model of the server.
   */
  public open fun engineModel(): String? = unwrap(this).getEngineModel()

  /**
   * The engine model of the server.
   */
  public open fun engineModel(`value`: String) {
    unwrap(this).setEngineModel(`value`)
  }

  /**
   * The major release version of the engine that you want to use.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The major release version of the engine that you want to use.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
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
   * The ARN of the instance profile that your Amazon EC2 instances use.
   */
  public open fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

  /**
   * The ARN of the instance profile that your Amazon EC2 instances use.
   */
  public open fun instanceProfileArn(`value`: String) {
    unwrap(this).setInstanceProfileArn(`value`)
  }

  /**
   * The Amazon EC2 instance type to use.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The Amazon EC2 instance type to use.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The Amazon EC2 key pair to set for the instance.
   */
  public open fun keyPair(): String? = unwrap(this).getKeyPair()

  /**
   * The Amazon EC2 key pair to set for the instance.
   */
  public open fun keyPair(`value`: String) {
    unwrap(this).setKeyPair(`value`)
  }

  /**
   * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level
   * data on your server if automated backups are enabled.
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level
   * data on your server if automated backups are enabled.
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * The start time for a one-hour period each week during which AWS OpsWorks CM performs
   * maintenance on the instance.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The start time for a one-hour period each week during which AWS OpsWorks CM performs
   * maintenance on the instance.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * A list of security group IDs to attach to the Amazon EC2 instance.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of security group IDs to attach to the Amazon EC2 instance.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of security group IDs to attach to the Amazon EC2 instance.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   *
   */
  public open fun serverName(): String? = unwrap(this).getServerName()

  /**
   *
   */
  public open fun serverName(`value`: String) {
    unwrap(this).setServerName(`value`)
  }

  /**
   * The service role that the AWS OpsWorks CM service backend uses to work with your account.
   */
  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  /**
   * The service role that the AWS OpsWorks CM service backend uses to work with your account.
   */
  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  /**
   * The IDs of subnets in which to launch the server EC2 instance.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The IDs of subnets in which to launch the server EC2 instance.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of subnets in which to launch the server EC2 instance.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
   * OpsWorks for Puppet Enterprise server.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
   * OpsWorks for Puppet Enterprise server.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
   * OpsWorks for Puppet Enterprise server.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworkscm.CfnServer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Associate a public IP address with a server that you are launching.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * Associate a public IP address with a server that you are launching.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

    /**
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
     * by BackupId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid)
     * @param backupId If you specify this field, AWS OpsWorks CM creates the server by using the
     * backup represented by BackupId. 
     */
    public fun backupId(backupId: String)

    /**
     * The number of automated backups that you want to keep.
     *
     * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number
     * is exceeded. The default value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount)
     * @param backupRetentionCount The number of automated backups that you want to keep. 
     */
    public fun backupRetentionCount(backupRetentionCount: Number)

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
     * @param customCertificate Supported on servers running Chef Automate 2.0 only. A PEM-formatted
     * HTTPS certificate. The value can be be a single, self-signed certificate, or a certificate
     * chain. If you specify a custom certificate, you must also specify values for `CustomDomain` and
     * `CustomPrivateKey` . The following are requirements for the `CustomCertificate` value:. 
     */
    public fun customCertificate(customCertificate: String)

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
     * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for
     * connecting to the server by using HTTPS. The private key must not be encrypted; it cannot be
     * protected by a password or passphrase. If you specify a custom private key, you must also
     * specify values for `CustomDomain` and `CustomCertificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey)
     * @param customPrivateKey Supported on servers running Chef Automate 2.0 only. A private key in
     * PEM format for connecting to the server by using HTTPS. The private key must not be encrypted;
     * it cannot be protected by a password or passphrase. If you specify a custom private key, you
     * must also specify values for `CustomDomain` and `CustomCertificate` . 
     */
    public fun customPrivateKey(customPrivateKey: String)

    /**
     * Enable or disable scheduled backups.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
     * @param disableAutomatedBackup Enable or disable scheduled backups. 
     */
    public fun disableAutomatedBackup(disableAutomatedBackup: Boolean)

    /**
     * Enable or disable scheduled backups.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
     * @param disableAutomatedBackup Enable or disable scheduled backups. 
     */
    public fun disableAutomatedBackup(disableAutomatedBackup: IResolvable)

    /**
     * The configuration management engine to use.
     *
     * Valid values include `ChefAutomate` and `Puppet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine)
     * @param engine The configuration management engine to use. 
     */
    public fun engine(engine: String)

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    public fun engineAttributes(engineAttributes: IResolvable)

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    public fun engineAttributes(engineAttributes: List<Any>)

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    public fun engineAttributes(vararg engineAttributes: Any)

    /**
     * The engine model of the server.
     *
     * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel)
     * @param engineModel The engine model of the server. 
     */
    public fun engineModel(engineModel: String)

    /**
     * The major release version of the engine that you want to use.
     *
     * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
     * valid values are `2019` or `2017` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion)
     * @param engineVersion The major release version of the engine that you want to use. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The ARN of the instance profile that your Amazon EC2 instances use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn)
     * @param instanceProfileArn The ARN of the instance profile that your Amazon EC2 instances use.
     * 
     */
    public fun instanceProfileArn(instanceProfileArn: String)

    /**
     * The Amazon EC2 instance type to use.
     *
     * For example, `m5.large` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype)
     * @param instanceType The Amazon EC2 instance type to use. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The Amazon EC2 key pair to set for the instance.
     *
     * This parameter is optional; if desired, you may specify this parameter to connect to your
     * instances by using SSH.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair)
     * @param keyPair The Amazon EC2 key pair to set for the instance. 
     */
    public fun keyPair(keyPair: String)

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
     * @param preferredBackupWindow The start time for a one-hour period during which AWS OpsWorks
     * CM backs up application-level data on your server if automated backups are enabled. 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

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
     * @param preferredMaintenanceWindow The start time for a one-hour period each week during which
     * AWS OpsWorks CM performs maintenance on the instance. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

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
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

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
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername)
     * @param serverName 
     */
    public fun serverName(serverName: String)

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
     * @param serviceRoleArn The service role that the AWS OpsWorks CM service backend uses to work
     * with your account. 
     */
    public fun serviceRoleArn(serviceRoleArn: String)

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
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance. 
     */
    public fun subnetIds(subnetIds: List<String>)

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
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
     * OpsWorks for Puppet Enterprise server.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
     * OpsWorks for Puppet Enterprise server.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworkscm.CfnServer.Builder =
        software.amazon.awscdk.services.opsworkscm.CfnServer.Builder.create(scope, id)

    /**
     * Associate a public IP address with a server that you are launching.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * Associate a public IP address with a server that you are launching.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress)
     * @param associatePublicIpAddress Associate a public IP address with a server that you are
     * launching. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    /**
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented
     * by BackupId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid)
     * @param backupId If you specify this field, AWS OpsWorks CM creates the server by using the
     * backup represented by BackupId. 
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * The number of automated backups that you want to keep.
     *
     * Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number
     * is exceeded. The default value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount)
     * @param backupRetentionCount The number of automated backups that you want to keep. 
     */
    override fun backupRetentionCount(backupRetentionCount: Number) {
      cdkBuilder.backupRetentionCount(backupRetentionCount)
    }

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
     * @param customCertificate Supported on servers running Chef Automate 2.0 only. A PEM-formatted
     * HTTPS certificate. The value can be be a single, self-signed certificate, or a certificate
     * chain. If you specify a custom certificate, you must also specify values for `CustomDomain` and
     * `CustomPrivateKey` . The following are requirements for the `CustomCertificate` value:. 
     */
    override fun customCertificate(customCertificate: String) {
      cdkBuilder.customCertificate(customCertificate)
    }

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
     * Supported on servers running Chef Automate 2.0 only. A private key in PEM format for
     * connecting to the server by using HTTPS. The private key must not be encrypted; it cannot be
     * protected by a password or passphrase. If you specify a custom private key, you must also
     * specify values for `CustomDomain` and `CustomCertificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey)
     * @param customPrivateKey Supported on servers running Chef Automate 2.0 only. A private key in
     * PEM format for connecting to the server by using HTTPS. The private key must not be encrypted;
     * it cannot be protected by a password or passphrase. If you specify a custom private key, you
     * must also specify values for `CustomDomain` and `CustomCertificate` . 
     */
    override fun customPrivateKey(customPrivateKey: String) {
      cdkBuilder.customPrivateKey(customPrivateKey)
    }

    /**
     * Enable or disable scheduled backups.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
     * @param disableAutomatedBackup Enable or disable scheduled backups. 
     */
    override fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    /**
     * Enable or disable scheduled backups.
     *
     * Valid values are `true` or `false` . The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup)
     * @param disableAutomatedBackup Enable or disable scheduled backups. 
     */
    override fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup.let(IResolvable::unwrap))
    }

    /**
     * The configuration management engine to use.
     *
     * Valid values include `ChefAutomate` and `Puppet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine)
     * @param engine The configuration management engine to use. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    override fun engineAttributes(engineAttributes: IResolvable) {
      cdkBuilder.engineAttributes(engineAttributes.let(IResolvable::unwrap))
    }

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    override fun engineAttributes(engineAttributes: List<Any>) {
      cdkBuilder.engineAttributes(engineAttributes)
    }

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
     * @param engineAttributes Optional engine attributes on a specified server. 
     */
    override fun engineAttributes(vararg engineAttributes: Any): Unit =
        engineAttributes(engineAttributes.toList())

    /**
     * The engine model of the server.
     *
     * Valid values in this release include `Monolithic` for Puppet and `Single` for Chef.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel)
     * @param engineModel The engine model of the server. 
     */
    override fun engineModel(engineModel: String) {
      cdkBuilder.engineModel(engineModel)
    }

    /**
     * The major release version of the engine that you want to use.
     *
     * For a Chef server, the valid value for EngineVersion is currently `2` . For a Puppet server,
     * valid values are `2019` or `2017` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion)
     * @param engineVersion The major release version of the engine that you want to use. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The ARN of the instance profile that your Amazon EC2 instances use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn)
     * @param instanceProfileArn The ARN of the instance profile that your Amazon EC2 instances use.
     * 
     */
    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * The Amazon EC2 instance type to use.
     *
     * For example, `m5.large` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype)
     * @param instanceType The Amazon EC2 instance type to use. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon EC2 key pair to set for the instance.
     *
     * This parameter is optional; if desired, you may specify this parameter to connect to your
     * instances by using SSH.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair)
     * @param keyPair The Amazon EC2 key pair to set for the instance. 
     */
    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

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
     * @param preferredBackupWindow The start time for a one-hour period during which AWS OpsWorks
     * CM backs up application-level data on your server if automated backups are enabled. 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

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
     * @param preferredMaintenanceWindow The start time for a one-hour period each week during which
     * AWS OpsWorks CM performs maintenance on the instance. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

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
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

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
     * @param securityGroupIds A list of security group IDs to attach to the Amazon EC2 instance. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername)
     * @param serverName 
     */
    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

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
     * @param serviceRoleArn The service role that the AWS OpsWorks CM service backend uses to work
     * with your account. 
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

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
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

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
     * @param subnetIds The IDs of subnets in which to launch the server EC2 instance. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
     * OpsWorks for Puppet Enterprise server.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or
     * OpsWorks for Puppet Enterprise server.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags)
     * @param tags A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef
     * Automate or OpsWorks for Puppet Enterprise server. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.opsworkscm.CfnServer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworkscm.CfnServer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer): CfnServer =
        CfnServer(cdkObject)

    internal fun unwrap(wrapped: CfnServer): software.amazon.awscdk.services.opsworkscm.CfnServer =
        wrapped.cdkObject
  }

  public interface EngineAttributeProperty {
    /**
     * The name of the engine attribute.
     *
     * *Attribute name for Chef Automate servers:*
     *
     * * `CHEF_AUTOMATE_ADMIN_PASSWORD`
     *
     * *Attribute names for Puppet Enterprise servers:*
     *
     * * `PUPPET_ADMIN_PASSWORD`
     * * `PUPPET_R10K_REMOTE`
     * * `PUPPET_R10K_PRIVATE_KEY`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworkscm-server-engineattribute.html#cfn-opsworkscm-server-engineattribute-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the engine attribute.
     *
     * *Attribute value for Chef Automate servers:*
     *
     * * `CHEF_AUTOMATE_PIVOTAL_KEY` : A base64-encoded RSA public key. The corresponding private
     * key is required to access the Chef API. You can generate this key by running the following
     * [OpenSSL](https://docs.aws.amazon.com/https://www.openssl.org/) command on Linux-based
     * computers.
     *
     * `openssl genrsa -out *pivotal_key_file_name* .pem 2048`
     *
     * On Windows-based computers, you can use the PuTTYgen utility to generate a base64-encoded RSA
     * private key. For more information, see [PuTTYgen - Key Generator for PuTTY on
     * Windows](https://docs.aws.amazon.com/https://www.ssh.com/ssh/putty/windows/puttygen) on SSH.com.
     *
     * *Attribute values for Puppet Enterprise servers:*
     *
     * * `PUPPET_ADMIN_PASSWORD` : An administrator password that you can use to sign in to the
     * Puppet Enterprise console webpage after the server is online. The password must use between 8
     * and 32 ASCII characters.
     * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for example,
     * ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port
     * 8170.
     * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
     * `PUPPET_R10K_PRIVATE_KEY` to specify a PEM-encoded private SSH key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworkscm-server-engineattribute.html#cfn-opsworkscm-server-engineattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EngineAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the engine attribute.
       * *Attribute name for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_ADMIN_PASSWORD`
       *
       * *Attribute names for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD`
       * * `PUPPET_R10K_REMOTE`
       * * `PUPPET_R10K_PRIVATE_KEY`
       */
      public fun name(name: String)

      /**
       * @param value The value of the engine attribute.
       * *Attribute value for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_PIVOTAL_KEY` : A base64-encoded RSA public key. The corresponding private
       * key is required to access the Chef API. You can generate this key by running the following
       * [OpenSSL](https://docs.aws.amazon.com/https://www.openssl.org/) command on Linux-based
       * computers.
       *
       * `openssl genrsa -out *pivotal_key_file_name* .pem 2048`
       *
       * On Windows-based computers, you can use the PuTTYgen utility to generate a base64-encoded
       * RSA private key. For more information, see [PuTTYgen - Key Generator for PuTTY on
       * Windows](https://docs.aws.amazon.com/https://www.ssh.com/ssh/putty/windows/puttygen) on
       * SSH.com.
       *
       * *Attribute values for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD` : An administrator password that you can use to sign in to the
       * Puppet Enterprise console webpage after the server is online. The password must use between 8
       * and 32 ASCII characters.
       * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for
       * example, ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote
       * opens TCP port 8170.
       * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
       * `PUPPET_R10K_PRIVATE_KEY` to specify a PEM-encoded private SSH key.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder =
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.builder()

      /**
       * @param name The name of the engine attribute.
       * *Attribute name for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_ADMIN_PASSWORD`
       *
       * *Attribute names for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD`
       * * `PUPPET_R10K_REMOTE`
       * * `PUPPET_R10K_PRIVATE_KEY`
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the engine attribute.
       * *Attribute value for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_PIVOTAL_KEY` : A base64-encoded RSA public key. The corresponding private
       * key is required to access the Chef API. You can generate this key by running the following
       * [OpenSSL](https://docs.aws.amazon.com/https://www.openssl.org/) command on Linux-based
       * computers.
       *
       * `openssl genrsa -out *pivotal_key_file_name* .pem 2048`
       *
       * On Windows-based computers, you can use the PuTTYgen utility to generate a base64-encoded
       * RSA private key. For more information, see [PuTTYgen - Key Generator for PuTTY on
       * Windows](https://docs.aws.amazon.com/https://www.ssh.com/ssh/putty/windows/puttygen) on
       * SSH.com.
       *
       * *Attribute values for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD` : An administrator password that you can use to sign in to the
       * Puppet Enterprise console webpage after the server is online. The password must use between 8
       * and 32 ASCII characters.
       * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for
       * example, ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote
       * opens TCP port 8170.
       * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
       * `PUPPET_R10K_PRIVATE_KEY` to specify a PEM-encoded private SSH key.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty,
    ) : CdkObject(cdkObject), EngineAttributeProperty {
      /**
       * The name of the engine attribute.
       *
       * *Attribute name for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_ADMIN_PASSWORD`
       *
       * *Attribute names for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD`
       * * `PUPPET_R10K_REMOTE`
       * * `PUPPET_R10K_PRIVATE_KEY`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworkscm-server-engineattribute.html#cfn-opsworkscm-server-engineattribute-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the engine attribute.
       *
       * *Attribute value for Chef Automate servers:*
       *
       * * `CHEF_AUTOMATE_PIVOTAL_KEY` : A base64-encoded RSA public key. The corresponding private
       * key is required to access the Chef API. You can generate this key by running the following
       * [OpenSSL](https://docs.aws.amazon.com/https://www.openssl.org/) command on Linux-based
       * computers.
       *
       * `openssl genrsa -out *pivotal_key_file_name* .pem 2048`
       *
       * On Windows-based computers, you can use the PuTTYgen utility to generate a base64-encoded
       * RSA private key. For more information, see [PuTTYgen - Key Generator for PuTTY on
       * Windows](https://docs.aws.amazon.com/https://www.ssh.com/ssh/putty/windows/puttygen) on
       * SSH.com.
       *
       * *Attribute values for Puppet Enterprise servers:*
       *
       * * `PUPPET_ADMIN_PASSWORD` : An administrator password that you can use to sign in to the
       * Puppet Enterprise console webpage after the server is online. The password must use between 8
       * and 32 ASCII characters.
       * * `PUPPET_R10K_REMOTE` : The r10k remote is the URL of your control repository (for
       * example, ssh://git&#64;your.git-repo.com:user/control-repo.git). Specifying an r10k remote
       * opens TCP port 8170.
       * * `PUPPET_R10K_PRIVATE_KEY` : If you are using a private Git repository, add
       * `PUPPET_R10K_PRIVATE_KEY` to specify a PEM-encoded private SSH key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworkscm-server-engineattribute.html#cfn-opsworkscm-server-engineattribute-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EngineAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty):
          EngineAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EngineAttributeProperty):
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty
    }
  }
}

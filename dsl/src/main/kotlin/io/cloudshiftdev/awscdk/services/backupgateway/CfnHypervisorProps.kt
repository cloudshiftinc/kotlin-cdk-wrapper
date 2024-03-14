package io.cloudshiftdev.awscdk.services.backupgateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnHypervisorProps {
  /**
   * The server host of the hypervisor.
   *
   * This can be either an IP address or a fully-qualified domain name (FQDN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-host)
   */
  public fun host(): String? = unwrap(this).getHost()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
   * hypervisor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-loggrouparn)
   */
  public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

  /**
   * The name of the hypervisor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The password for the hypervisor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-password)
   */
  public fun password(): String? = unwrap(this).getPassword()

  /**
   * The tags of the hypervisor configuration to import.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The username for the hypervisor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-username)
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A builder for [CfnHypervisorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param host The server host of the hypervisor.
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     */
    public fun host(host: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     * encrypt the hypervisor.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     * requested log.
     */
    public fun logGroupArn(logGroupArn: String)

    /**
     * @param name The name of the hypervisor.
     */
    public fun name(name: String)

    /**
     * @param password The password for the hypervisor.
     */
    public fun password(password: String)

    /**
     * @param tags The tags of the hypervisor configuration to import.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the hypervisor configuration to import.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param username The username for the hypervisor.
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps.Builder
        = software.amazon.awscdk.services.backupgateway.CfnHypervisorProps.builder()

    /**
     * @param host The server host of the hypervisor.
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     */
    override fun host(host: String) {
      cdkBuilder.host(host)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     * encrypt the hypervisor.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     * requested log.
     */
    override fun logGroupArn(logGroupArn: String) {
      cdkBuilder.logGroupArn(logGroupArn)
    }

    /**
     * @param name The name of the hypervisor.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param password The password for the hypervisor.
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * @param tags The tags of the hypervisor configuration to import.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags of the hypervisor configuration to import.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param username The username for the hypervisor.
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.backupgateway.CfnHypervisorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps,
  ) : CdkObject(cdkObject), CfnHypervisorProps {
    /**
     * The server host of the hypervisor.
     *
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-host)
     */
    override fun host(): String? = unwrap(this).getHost()

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
     * hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-loggrouparn)
     */
    override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * The name of the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The password for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-password)
     */
    override fun password(): String? = unwrap(this).getPassword()

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The username for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-username)
     */
    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHypervisorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps):
        CfnHypervisorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHypervisorProps):
        software.amazon.awscdk.services.backupgateway.CfnHypervisorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backupgateway.CfnHypervisorProps
  }
}

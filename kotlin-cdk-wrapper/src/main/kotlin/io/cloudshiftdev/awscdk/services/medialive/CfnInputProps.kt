@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * Object tags;
 * CfnInputProps cfnInputProps = CfnInputProps.builder()
 * .destinations(List.of(InputDestinationRequestProperty.builder()
 * .streamName("streamName")
 * .build()))
 * .inputDevices(List.of(InputDeviceSettingsProperty.builder()
 * .id("id")
 * .build()))
 * .inputSecurityGroups(List.of("inputSecurityGroups"))
 * .mediaConnectFlows(List.of(MediaConnectFlowRequestProperty.builder()
 * .flowArn("flowArn")
 * .build()))
 * .name("name")
 * .roleArn("roleArn")
 * .sources(List.of(InputSourceRequestProperty.builder()
 * .passwordParam("passwordParam")
 * .url("url")
 * .username("username")
 * .build()))
 * .tags(tags)
 * .type("type")
 * .vpc(InputVpcRequestProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html)
 */
public interface CfnInputProps {
  /**
   * Settings that apply only if the input is a push type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
   */
  public fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * Settings that apply only if the input is an Elemental Link input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
   */
  public fun inputDevices(): Any? = unwrap(this).getInputDevices()

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
   */
  public fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
      emptyList()

  /**
   * Settings that apply only if the input is a MediaConnect input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
   */
  public fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

  /**
   * A name for the input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
   *
   * This doesn't apply to other types of inputs. The role is identified by its ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Settings that apply only if the input is a pull type of input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
   */
  public fun sources(): Any? = unwrap(this).getSources()

  /**
   * A collection of tags for this input.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The type for this input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
   */
  public fun vpc(): Any? = unwrap(this).getVpc()

  /**
   * A builder for [CfnInputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    public fun destinations(destinations: IResolvable)

    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    public fun destinations(destinations: List<Any>)

    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    public fun destinations(vararg destinations: Any)

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    public fun inputDevices(inputDevices: IResolvable)

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    public fun inputDevices(inputDevices: List<Any>)

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    public fun inputDevices(vararg inputDevices: Any)

    /**
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type.
     */
    public fun inputSecurityGroups(inputSecurityGroups: List<String>)

    /**
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type.
     */
    public fun inputSecurityGroups(vararg inputSecurityGroups: String)

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    public fun mediaConnectFlows(mediaConnectFlows: IResolvable)

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    public fun mediaConnectFlows(mediaConnectFlows: List<Any>)

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    public fun mediaConnectFlows(vararg mediaConnectFlows: Any)

    /**
     * @param name A name for the input.
     */
    public fun name(name: String)

    /**
     * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
     * Amazon VPC input.
     * This doesn't apply to other types of inputs. The role is identified by its ARN.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    public fun sources(vararg sources: Any)

    /**
     * @param tags A collection of tags for this input.
     * Each tag is a key-value pair.
     */
    public fun tags(tags: Any)

    /**
     * @param type The type for this input.
     */
    public fun type(type: String)

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    public fun vpc(vpc: IResolvable)

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    public fun vpc(vpc: CfnInput.InputVpcRequestProperty)

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eae357f6c95dedd1105307d2774e33375fd49905396a1804bb5edf7e6aa368c7")
    public fun vpc(vpc: CfnInput.InputVpcRequestProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInputProps.Builder =
        software.amazon.awscdk.services.medialive.CfnInputProps.builder()

    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    /**
     * @param destinations Settings that apply only if the input is a push type of input.
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    override fun inputDevices(inputDevices: IResolvable) {
      cdkBuilder.inputDevices(inputDevices.let(IResolvable::unwrap))
    }

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    override fun inputDevices(inputDevices: List<Any>) {
      cdkBuilder.inputDevices(inputDevices)
    }

    /**
     * @param inputDevices Settings that apply only if the input is an Elemental Link input.
     */
    override fun inputDevices(vararg inputDevices: Any): Unit = inputDevices(inputDevices.toList())

    /**
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type.
     */
    override fun inputSecurityGroups(inputSecurityGroups: List<String>) {
      cdkBuilder.inputSecurityGroups(inputSecurityGroups)
    }

    /**
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type.
     */
    override fun inputSecurityGroups(vararg inputSecurityGroups: String): Unit =
        inputSecurityGroups(inputSecurityGroups.toList())

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    override fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows.let(IResolvable::unwrap))
    }

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    override fun mediaConnectFlows(mediaConnectFlows: List<Any>) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows)
    }

    /**
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input.
     */
    override fun mediaConnectFlows(vararg mediaConnectFlows: Any): Unit =
        mediaConnectFlows(mediaConnectFlows.toList())

    /**
     * @param name A name for the input.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
     * Amazon VPC input.
     * This doesn't apply to other types of inputs. The role is identified by its ARN.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    /**
     * @param sources Settings that apply only if the input is a pull type of input.
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * @param tags A collection of tags for this input.
     * Each tag is a key-value pair.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type The type for this input.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    override fun vpc(vpc: CfnInput.InputVpcRequestProperty) {
      cdkBuilder.vpc(vpc.let(CfnInput.InputVpcRequestProperty::unwrap))
    }

    /**
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eae357f6c95dedd1105307d2774e33375fd49905396a1804bb5edf7e6aa368c7")
    override fun vpc(vpc: CfnInput.InputVpcRequestProperty.Builder.() -> Unit): Unit =
        vpc(CfnInput.InputVpcRequestProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnInputProps,
  ) : CdkObject(cdkObject), CfnInputProps {
    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     */
    override fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     */
    override fun inputDevices(): Any? = unwrap(this).getInputDevices()

    /**
     * The list of input security groups (referenced by IDs) to attach to the input if the input is
     * a push type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
     */
    override fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
        emptyList()

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     */
    override fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

    /**
     * A name for the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
     *
     * This doesn't apply to other types of inputs. The role is identified by its ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     */
    override fun sources(): Any? = unwrap(this).getSources()

    /**
     * A collection of tags for this input.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The type for this input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     */
    override fun vpc(): Any? = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputProps):
        CfnInputProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInputProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInputProps):
        software.amazon.awscdk.services.medialive.CfnInputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnInputProps
  }
}

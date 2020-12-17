package com.snimma1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "row")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vote {
    @XmlAttribute(name = "Id")
    private BigInteger id;

    @XmlAttribute(name = "PostId")
    private BigInteger postId;

    @XmlAttribute(name = "VoterTypeId")
    private Integer voteTypeId;

    @XmlAttribute(name = "UserId")
    private BigInteger userId;

    @XmlAttribute(name = "CreationDate")
    private XMLGregorianCalendar creationDate;

    @XmlAttribute(name = "BountyAmount")
    private Integer bountyAmount;
}
